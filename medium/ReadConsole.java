package medium;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsole {

    private static ReadConsole sInstance;

    private Scanner mScanner;

    public static ReadConsole getInstance() {
        if (sInstance == null) {
            sInstance = new ReadConsole();
        }
        return sInstance;
    }

    public ReadConsole() {
        mScanner = new Scanner(System.in);
    }

    /* we use BaseMortgageCriteria instead of using MortgageCalculator2019 or 2020
    this is where we have the benefits of upcasting
    */
    public BaseCustomerCreater ReadCustomerInfos(BaseMortgageCriteria calculator, BaseCustomerCreater customer) {
        var name = nameOfTheConsumer();
        int age = readAge(calculator.getAgeMin(), calculator.getAgeMax());
        int monthlyIncome = readMonthlyIncome(calculator.getMonthlyIncomeMin());
        int principal = (int) readPrincipal("Principal", calculator.getPrincipalMin(), calculator.getPrincipalMax());
        float annualInterest = (float) readPrincipal("Annual Interest Rate: ", calculator.getAnnualInterestMin(), calculator.getAnnualInterestMax());
        byte years = (byte) readPrincipal("Period (Years): ", calculator.getYearsMin(), calculator.getYearsMax());
        customer.setAge(age);
        customer.setMonthlyIncome(monthlyIncome);
        customer.setPrincipal(principal);
        customer.setAnnualInterest(annualInterest);
        customer.setYears(years);
        customer.setName(name);
        return customer;
    }

    public double readPrincipal(String prompt, double min, double max) {

        double value;
        while (true) {
            System.out.println(prompt);
            value = getADouble();

            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public int readAge(double min, double max) {

        System.out.println("Age: ");
        int age = getAnInteger();

        while (age > max || age < min) {
            System.out.println("The age entered is not appropriate " +
                    "Please enter an another value between " + min + " and " + max + " or press q  to exit.");
            String string_age = mScanner.next();


            if (string_age.equalsIgnoreCase("q")) {
                System.out.println("exit");
                System.exit(0);
            } else {
                try {
                    age = Integer.parseInt(string_age);
                } catch (NumberFormatException ex) {
                    System.out.print("That's not " + "a valid value. Try again: ");
                }
                if (age < max && age > min) {
                    break;
                }
            }
        }
        return age;
    }

    public int readMonthlyIncome(double income) {
        System.out.println("Monthly Income: ");
        int monthly_income = getAnInteger();
        while (income > monthly_income) {
            System.out.println("Monthly income is below " + income + " Euros " +
                    "is not enough. Please enter an another amount or press q  to exit.");
            String string_monthly_income = mScanner.next();
            if (string_monthly_income.equalsIgnoreCase("q")) {
                System.out.println("exit");
                System.exit(0);
            } else {
                try {
                    monthly_income = Integer.parseInt(string_monthly_income);
                } catch (NumberFormatException ex) {
                    System.out.print("That's not " + "a valid value. Try again: ");
                }
                if (monthly_income >= income) {
                    break;
                }
            }
        }
        return monthly_income;
    }

    private String nameOfTheConsumer() {
        System.out.println("Name: ");
        String name = mScanner.next();
        return name;
    }

    private int getAnInteger() {
        while (true) {
            try {
                return mScanner.nextInt();
            } catch (InputMismatchException e) {
                mScanner.next();
                System.out.print("That's not "
                        + "a valid value.. Try again: ");
            }
        }
    }

    private double getADouble() {
        while (true) {
            try {
                return mScanner.nextDouble();
            } catch (InputMismatchException e) {
                mScanner.next();
                System.out.print("That's not "
                        + "a valid value. Try again: ");
            }
        }
    }

}

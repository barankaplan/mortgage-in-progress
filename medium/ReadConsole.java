package medium;


import java.util.Scanner;

public class ReadConsole  {

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
    public BaseCustomerCreater ReadCustomerInfos(BaseMortgageCriteria calculator, BaseCustomerCreater customer  ) {
        int age=readAge(calculator.getAgeMin(), calculator.getAgeMax());
        int monthlyIncome=readMonthlyIncome(calculator.getMonthlyIncomeMin());
        int principal = (int) readNumber("Principal", calculator.getPrincipalMin(), calculator.getPrincipalMax());
        float annualInterest = (float) readNumber("Annual Interest Rate: ", calculator.getAnnualInterestMin(), calculator.getAnnualInterestMax());
        byte years = (byte) readNumber("Period (Years): ", calculator.getYearsMin(), calculator.getYearsMax());
        customer.setAge(age);
        customer.setMonthlyIncome(monthlyIncome);
        customer.setPrincipal(principal);
        customer.setAnnualInterest(annualInterest);
        customer.setYears(years);
        return  customer;
    }

    public  double readNumber(String prompt, double min, double max) {

        double value;
        while (true) {
            System.out.println(prompt);
            value = mScanner.nextDouble();

            if (value >= min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " and " + max);
        }
        return value;
    }

    public  int readAge(double min,double max) {
        System.out.println("Age: ");
        int age = mScanner.nextInt();

        while (age > max || age < min) {
            System.out.println("The age entered is not appropriate " +
                    "Please enter an another value between 20 and 60 or press q  to exit.");
            String string_age = mScanner.next();

            if (string_age.equalsIgnoreCase("q")) {
                System.out.println("exit");
                System.exit(0);
            } else {
                age = Integer.parseInt(string_age);
                if (age < max && age > min) {


                    break;
                }
            }
        }
        return age;
    }

    public int readMonthlyIncome(double income){
        System.out.println("Monthly Income: ");

        int monthly_income=mScanner.nextInt();

        while (income > monthly_income) {
            System.out.println("Monthly income is below 1000 Euros " +
                    "is not enough. Please enter an another amount or press q  to exit.");

            String string_monthly_income = mScanner.next();

            if (string_monthly_income.equalsIgnoreCase("q")){
                System.out.println("exit");
                System.exit(0);
            }
            else {
                monthly_income=Integer.parseInt(string_monthly_income);
                if (monthly_income >=income){

                    break;
                }
            }
        }
        return monthly_income;

    }

}

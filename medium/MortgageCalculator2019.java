package medium;


import java.text.NumberFormat;
/* encapsulation : All mathematical operations related to calculations based here*/

/* we extend BaseMortgageCalculator, the calculation steps are the same, but the contents change over the years */
public class MortgageCalculator2019 extends BaseMortgageCalculator implements Calculable {
    /*abstract class cant be instantiated , we can only extend it */
    /*In contrast final classes cannot be inherited.we can't extend them anymore! N0 inheritance!
    We use them when we’ve made certain assumptions about a class and we want to prevent
    other classes extending our class and break those assumptions. */

    private final static byte MONTHS_IN_YEAR = 12;
    private final static  byte PERCENT = 100;
    private static boolean ENABLE = true;
    private BaseCustomerCreater customer;

    public MortgageCalculator2019(BaseCustomerCreater customer) {
        this.customer = customer;
    }

    @Override
    public int findTheGroup() {
        int group;
        if (customer.getAge() < 30 && customer.getMonthlyIncome() > 3000) {
            group = 1;
            ENABLE = true;
            System.out.println("belongs to group " + group);
        } else if (customer.getAge() < 30 && customer.getMonthlyIncome() < 3000 && customer.getPrincipal()>200_000 && customer.getYears()>20 ) {
            group = 2;
            ENABLE = false;
            System.out.println("belongs to group " + group);

        } else if (customer.getAge() >= 30 && customer.getMonthlyIncome() >= 3000 ) {
            group = 3;
            ENABLE = true;
            System.out.println("belongs to group " + group);
        } else {
            group = 4;
            ENABLE = false;
            System.out.println("belongs to group " + group);

        }
        return group;
    }
    @Override
    public double[] payment_schedule() {
        var balances = new double[getNumberOfPayments()];
        for (short month = 1; month <= getNumberOfPayments(); month++) {
            System.out.println(NumberFormat.getCurrencyInstance().format(calculateBalance(month)));
            balances[month - 1] = calculateBalance(month);
        }
        return balances;
    }
    @Override
    public double calculateBalance(short numberOfPaymentsMade) {

        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();
        double balance = customer.getPrincipal()
                * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(1 + monthlyInterest, numberOfPaymentsMade))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        return balance;
    }
    @Override
    public double calculateMortgage() {
        findTheGroup();
        enableMethod();
        System.out.println("Calculated in 2019");
        float monthlyInterest = getMonthlyInterest();
        float numberOfPayments = getNumberOfPayments();

        return customer.getPrincipal()
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

    }

    /* abstraction- no one has to know the details of following methods*/
    private void enableMethod() {
        if(!ENABLE){
            System.out.println("Mortgage is not possibe");
            System.exit(0);
        }
    }
    private int getNumberOfPayments() {
        return customer.getYears() * MONTHS_IN_YEAR;
    }
    private float getMonthlyInterest() {
        return customer.getAnnualInterest() / PERCENT / MONTHS_IN_YEAR;
    }


}

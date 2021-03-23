package medium;


import java.text.NumberFormat;
import java.util.Arrays;

public class MortgageReport  {


    private final Calculable calculator;

    public MortgageReport(Calculable calculator) {
        this.calculator = calculator;
    }
    private void printMortgage() {


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(calculator.calculateMortgage());
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }
    private void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        System.out.println(Arrays.toString(calculator.payment_schedule()));
    }
    private void printDatabase(){
        System.out.println(ConsumerDatabase.getAgeList().toString());
        System.out.println(ConsumerDatabase.getMonthlyIncome().toString());
        System.out.println(ConsumerDatabase.getPrincipal().toString());


    }
    public void printAll(){
        printMortgage();
        printPaymentSchedule();
        printDatabase();

    }

}

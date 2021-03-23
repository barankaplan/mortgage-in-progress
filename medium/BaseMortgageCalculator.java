package medium;

public abstract class BaseMortgageCalculator {
    /* An abstract class is a partially-implemented (half-cooked) class.
     We cannot instantiate them. But we use them
     to share some common code across their subclasses.
     in other words following code is not possible!
     var abc= new BaseMortgageCalculator();
     */


    public abstract int findTheGroup();
    public abstract double calculateBalance(short numberOfPaymentsMade);




}

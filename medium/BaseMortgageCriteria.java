package medium;

public abstract class BaseMortgageCriteria {
    public abstract int getAgeMin();
    public abstract int getAgeMax();
    public abstract int getMonthlyIncomeMin();
    public abstract int getPrincipalMin();
    public abstract int getPrincipalMax();
    public abstract float getAnnualInterestMin();
    public abstract float getAnnualInterestMax();
    public abstract byte getYearsMin();
    public abstract byte getYearsMax();
}

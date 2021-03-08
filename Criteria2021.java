package medium;

public class Criteria2020 extends BaseMortgageCriteria {

    private static Criteria2020 sInstance;
    public static Criteria2020 getInstance() {
        if (sInstance == null) {
            sInstance = new Criteria2020();
        }
        return sInstance;
    }

    @Override
    public int getAgeMin() {
        return 18;
    }

    @Override
    public int getAgeMax() {
        return 75;
    }

    @Override
    public int getMonthlyIncomeMin() {
        return 1750;
    }

    @Override
    public int getPrincipalMin() {
        return 5000;
    }

    @Override
    public int getPrincipalMax() {
        return 80000;
    }

    @Override
    public float getAnnualInterestMin() {
        return 3;
    }

    @Override
    public float getAnnualInterestMax() {
        return 12;
    }

    @Override
    public byte getYearsMin() {
        return 2;
    }

    @Override
    public byte getYearsMax() {
        return 25;
    }
}

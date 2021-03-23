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
        return 25;
    }

    @Override
    public int getAgeMax() {
        return 80;
    }

    @Override
    public int getMonthlyIncomeMin() {
        return 2000;
    }

    @Override
    public int getPrincipalMin() {
        return 1500;
    }

    @Override
    public int getPrincipalMax() {
        return 500000;
    }

    @Override
    public float getAnnualInterestMin() {
        return 5;
    }

    @Override
    public float getAnnualInterestMax() {
        return 15;
    }

    @Override
    public byte getYearsMin() {
        return 5;
    }

    @Override
    public byte getYearsMax() {
        return 30;
    }
}

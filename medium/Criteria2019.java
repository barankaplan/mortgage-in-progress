package medium;

public class Criteria2019 extends BaseMortgageCriteria {

    private static Criteria2019 sInstance;
    public static Criteria2019 getInstance() {
        if (sInstance == null) {
            sInstance = new Criteria2019();
        }
        return sInstance;
    }

    @Override
    public int getAgeMin() {
        return 20;
    }

    @Override
    public int getAgeMax() {
        return 60;
    }

    @Override
    public int getMonthlyIncomeMin() {
        return 1000;
    }

    @Override
    public int getPrincipalMin() {
        return 1000;
    }

    @Override
    public int getPrincipalMax() {
        return 1000000;
    }

    @Override
    public float getAnnualInterestMin() {
        return 1;
    }

    @Override
    public float getAnnualInterestMax() {
        return 30;
    }

    @Override
    public byte getYearsMin() {
        return 1;
    }

    @Override
    public byte getYearsMax() {
        return 30;
    }
}

package medium;

public class Customer extends BaseCustomerCreater {
    private   int age ;
    private   int monthly_income ;
    private   int principal ;
    private   float annualInterest;
    private   byte years;

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int getMonthlyIncome() {
        return monthly_income;
    }
    @Override
    public void setMonthlyIncome(int monthly_income) {
        this.monthly_income = monthly_income;
    }

    @Override
    public int getPrincipal() {
        return principal;
    }
    @Override
    public void setPrincipal(int principal) {
        this.principal = principal;
    }
    @Override
    public float getAnnualInterest() {
        return annualInterest;
    }
    @Override
    public void setAnnualInterest(float annualInterest) {
        this.annualInterest = annualInterest;
    }
    @Override
    public byte getYears() {
        return years;
    }
    @Override
    public void setYears(byte years) {
        this.years = years;
    }
}

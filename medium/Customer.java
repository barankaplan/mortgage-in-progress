package medium;

import org.jetbrains.annotations.NotNull;

public class Customer extends BaseCustomerCreater {
    private   int age ;
    private   int monthly_income ;
    private   int principal ;
    private   float annualInterest;
    private   byte years;
    private String name;

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

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int compareTo(@NotNull BaseCustomerCreater o) {
        if (this.getMonthlyIncome() > o.getMonthlyIncome()) {
            return 1;
        } else if (this.getMonthlyIncome() < o.getMonthlyIncome()) {
            return -1;
        }
        return 0;
    }


//    @Override
//    public String toString() {
//        return "Customer{" +
//                "name='" + name + '\'' +
//                '}';
//    }




}

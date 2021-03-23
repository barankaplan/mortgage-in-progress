package medium;

import java.util.ArrayList;
import java.util.List;
 
public  class ConsumerDatabase {


    private static final List<Integer> ageList = new ArrayList<Integer>();
    private static final List<Integer> monthlyIncome = new ArrayList<Integer>();
    private static final List<Integer> principal = new ArrayList<Integer>();

    public static void addCustomer(BaseCustomerCreater customer) {
        ageList.add(customer.getAge());
        monthlyIncome.add(customer.getMonthlyIncome());
        principal.add(customer.getPrincipal());
    }

    public static List<Integer> getAgeList() {
        return ageList;
    }
    public static List<Integer> getMonthlyIncome() {
        return monthlyIncome;
    }
    public static List<Integer> getPrincipal() {
        return principal;
    }








}

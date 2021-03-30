package medium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public  class ConsumerDatabase {

    private static final List<BaseCustomerCreater> customers = new ArrayList<>();
    private static final List<Integer> ageList = new ArrayList<>();
    private static final List<Integer> monthlyIncome = new ArrayList<Integer>();
    private static final List<Integer> principal = new ArrayList<Integer>();
    private static final List<String> namelist = new ArrayList<>();

    public static void addCustomer(BaseCustomerCreater customer) {
        ageList.add(customer.getAge());
        monthlyIncome.add(customer.getMonthlyIncome());
        principal.add(customer.getPrincipal());
        namelist.add(customer.getName());
        customers.add(customer);

    }
    public static void optimumCustomer(){
        BaseCustomerCreater optimumCostumer = Collections.max(ConsumerDatabase.getcustomer());
        System.out.println("Optimum Customer demanded  : " + optimumCostumer.getPrincipal() + "\n"+
                "her/his name is  : " + optimumCostumer.getName()+"\n"+
                "and "+optimumCostumer.getAge()+" years old.");
        Collections.sort(ConsumerDatabase.getcustomer(), new AgeComparator());
        System.out.println(customers);
        //generic class implements generic interface
        Collections.sort(ConsumerDatabase.getcustomer(),new ReverseComparator<>(new AgeComparator()));
    }

    public static List<Integer> getAgeList() { return ageList;}
    public static List<Integer> getMonthlyIncome() {
        return monthlyIncome;
    }
    public static List<Integer> getPrincipal() {
        return principal;
    }
    public static List<String> getName() { return namelist;}
    public static List<BaseCustomerCreater> getcustomer() { return customers;}


}

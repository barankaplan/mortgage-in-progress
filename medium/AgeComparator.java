package medium;

import java.util.Comparator;

public class AgeComparator implements Comparator <BaseCustomerCreater> {
    @Override
    public int compare(BaseCustomerCreater o1, BaseCustomerCreater o2) {
        return Integer.compare(o1.getAge(),o2.getAge()) ;
    }
}

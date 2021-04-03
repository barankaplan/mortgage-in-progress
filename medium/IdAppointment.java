package medium;

public class IdAppointment implements IdAppointed {
    private int id=0;
    @Override
    public void assignTheId(BaseCustomerCreater customer) {
        customer.setID(id++);
   

    }
}

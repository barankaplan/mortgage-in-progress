package medium;

public class IdAppointment implements IdAppointed {
    private int id=0;
    private BaseCustomerCreater customer;

    public IdAppointment(BaseCustomerCreater customer) {
        this.customer = customer;
    }

    @Override

    public int assignTheId() {
        return customer.setID(id++);


    }
}

package medium;

public class CheckAvailability  {



    public void createCustomer2019() {

        BaseCustomerCreater customer =new Customer();
        BaseMortgageCriteria criteria= new Criteria2019();
        customer= new ReadConsole().ReadCustomerInfos(criteria,customer);
        Calculable calculator=new MortgageCalculator2019(customer);
        var report=new MortgageReport(calculator);
        ConsumerDatabase.addCustomer(customer);
        report.printAll();
    }

    public void createCustomer2020() {
        BaseCustomerCreater customer =new Customer();
        BaseMortgageCriteria criteria= new Criteria2020();
        customer= new ReadConsole().ReadCustomerInfos(criteria,customer);
        Calculable calculator=new MortgageCalculator2020(customer);
        var report=new MortgageReport(calculator);
        ConsumerDatabase.addCustomer(customer);
        report.printAll();
    }
    
        public void createCustomer2021() {
        BaseCustomerCreater customer =new Customer();
        BaseMortgageCriteria criteria= new Criteria2021();
        customer= new ReadConsole().ReadCustomerInfos(criteria,customer);
        Calculable calculator=new MortgageCalculator2021(customer);
        var report=new MortgageReport(calculator);
        ConsumerDatabase.addCustomer(customer);
        report.printAll();
    }

}

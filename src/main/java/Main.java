public class Main {
    public static void main(String[] args) {
        CustomerManager manageCustomer = new CustomerManager();
        manageCustomer.addCustomer("John Doe");
        manageCustomer.addCustomer("Jane Smith");
        manageCustomer.addOrder("Order1");
        manageCustomer.addOrder("Order2");
        manageCustomer.processOrderByCustomer("John Doe");
        manageCustomer.generateSummaryReport();
    }
}
public class Main {
    public static void main(String[] args) {
        CustomerManager manageCustomer = new CustomerManager();
        manageCustomer.aC("John Doe");
        manageCustomer.aC("Jane Smith");
        manageCustomer.aO("Order1");
        manageCustomer.aO("Order2");
        manageCustomer.pO("John Doe");
        manageCustomer.gR();
    }
}
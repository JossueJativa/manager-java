import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    public List<String> clientList = new ArrayList<>();
    public List<String> orderList = new ArrayList<>();

    // Adds a customer to the list
    public void addCustomer(String n) {
        clientList.add(n);
        System.out.println("Added customer: " + n);
    }

    // Adds an order to the list
    public void addOrder(String o) {
        orderList.add(o);
        System.out.println("Order added: " + o)
    }

    // Processes all orders for a specific customer
    public void processOrderByCustomer(String c) {
        System.out.println("Processing orders for: " + c);
        iterationMethod(orderList, "Processing order");
    }

    // Generates a summary report for customers and orders
    public void generateSummaryReport() {
        System.out.println("Customer Report");
        iterationMethod(clientList, "Customer");
        System.out.println("Order Report");
        iterationMethod(orderList, "Order");
    }

    // Iterates through a list and prints a message
    private void iterationMethod(List<String> list, String message) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(message + ": " + list.get(i));
        }
    }
}

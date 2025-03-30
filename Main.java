import Classes.*;
import Interface.InvoiceGeneratorInterface;
import Interface.NotificationInterface;
import Interface.OrderInterface;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("Robee Herrera", "Quezon City", 200.0, 3, "robs@test.com");

        Calculate priceCalculator = new Calculate();
        OrderInterface orderInterface = new PlaceOrder();
        InvoiceGeneratorInterface invoiceGeneratorInterface = new Invoice();
        NotificationInterface notificationInterface = new Email();

        ProcessOrder processOrder = new ProcessOrder(orderInterface, invoiceGeneratorInterface, notificationInterface, priceCalculator);

        processOrder.processingOrder(order, "txt.file");
    }
}
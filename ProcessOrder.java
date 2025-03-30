import Classes.Order;
import Interface.CalculateInterface;
import Interface.InvoiceGeneratorInterface;
import Interface.NotificationInterface;
import Interface.OrderInterface;

public class ProcessOrder {
    private OrderInterface orderInterface;
    private InvoiceGeneratorInterface invoiceGeneratorInterface;
    private NotificationInterface notificationInterface;
    private CalculateInterface calculateInterface;

    public ProcessOrder(OrderInterface orderInterface ,InvoiceGeneratorInterface invoiceGeneratorInterface, NotificationInterface notificationInterface, CalculateInterface calculateInterface ) {
        this.orderInterface = orderInterface;
        this.invoiceGeneratorInterface = invoiceGeneratorInterface;
        this.notificationInterface = notificationInterface;
        this.calculateInterface = calculateInterface;
    }

    public void processingOrder(Order order, String fileName) {
        double totalPrice = calculateInterface.calculate(order.getPrice(), order.getQuantity());
        orderInterface.placeOrder(order);
        invoiceGeneratorInterface.generate(order, fileName);
        notificationInterface.sendNotification(order);

        System.out.println("Total Price is: " + totalPrice);
    }
}

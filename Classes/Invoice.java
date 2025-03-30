package Classes;

import Interface.InvoiceGeneratorInterface;

public class Invoice implements InvoiceGeneratorInterface {
    @Override
    public void generate(Order order, String fileName) {
        System.out.println("Invoice Details\n" +
                "Filename: " + fileName +
                "\nName: " + order.getCustomerName());
    }
}

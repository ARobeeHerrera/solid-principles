package Interface;

import Classes.Order;

public interface InvoiceGeneratorInterface {
    public void generate(Order order, String fileName);
}

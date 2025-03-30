package Classes;

import Interface.OrderInterface;

public class PlaceOrder implements OrderInterface {
    @Override
    public void placeOrder(Order order) {
        System.out.println("Place ordered \n" +
                "Name: "+ order.getCustomerName() +
                "\nAddress: " + order.getAddress());
    }
}

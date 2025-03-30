package Classes;

import Interface.CalculateInterface;

public class Calculate implements CalculateInterface {
    @Override
    public double calculate(double price, int quantity) {
        return price * quantity;
    }
}

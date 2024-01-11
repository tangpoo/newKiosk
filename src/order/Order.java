package order;

import domain.Item.Menu;

import java.util.List;

public class Order {

    private int waitingNumber = 1;

    public static int totalPrice(List<Menu> cart) {
        int price = 0;
        for (Menu menu : cart) {
            price += menu.getPrice() * menu.count;
        }

        return price;
    }

    public int getWaitingNumber() {
        return waitingNumber++;
    }

    public void setWaitingNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }
}

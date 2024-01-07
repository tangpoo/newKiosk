package order;

import domain.Item.Menu;

import java.util.List;

public class Order {
    public static int totalPrice(List<Menu> cart){
        int price = 0;
        for(Menu menu : cart){
            price += menu.getPrice();
        }

        return price;
    }
}

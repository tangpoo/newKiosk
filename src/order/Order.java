package order;

import domain.Item.Menu;

import java.util.List;
import java.util.Map;

public class Order {
    public static int totalPrice(List<Menu> cart){
        int price = 0;
        for(Menu menu : cart){
            price += menu.getPrice() * menu.count;
        }

        return price;
    }
}

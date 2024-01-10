package domain;

import domain.Item.Menu;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Menu> cart = new ArrayList<>();

    public void addCart(Menu menu) {
        if (!cart.contains(menu)) {
            cart.add(menu);
        } else {
            menu.count++;
        }
    }

    public List<Menu> getCart() {
        return cart;
    }


    public void clearCart() {
        cart.clear();
    }

    public int cartSize() {
        return cart.size();
    }

    public boolean sizeCheck() {
        return cart.isEmpty();
    }
}

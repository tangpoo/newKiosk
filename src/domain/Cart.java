package domain;

import domain.Item.Menu;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Menu> cart = new ArrayList<>();

    public void addCart(Menu menu){
        cart.add(menu);
    }

    public List<Menu> getCart(){
        return cart;
    }


    public void clearCart(){
        cart.clear();
    }

    public int cartSize(){
        return cart.size();
    }
}

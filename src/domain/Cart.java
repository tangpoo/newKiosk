package domain;

import domain.Item.Menu;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {

    private List<Menu> cart = new ArrayList<>();

    public void addCart(Menu menu){
        if(!cart.contains(menu)){
            cart.add(menu);
        }
        else{
            menu.count++;
        }
    }
    public void addCart_option(Menu menu){
        //menu.price = menu.getPrice() + 500;

        if(!cart.contains(menu)){
            cart.add(menu);
        }
        else{
            menu.count++;
        }
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

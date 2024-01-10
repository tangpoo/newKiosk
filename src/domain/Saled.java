package domain;

import domain.Item.Menu;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Saled {
    public Map<Menu, Integer> saled = new HashMap();


    public void addSaledList(List<Menu> cart) {
        for (Menu menu : cart) {
            saled.put(menu, saled.getOrDefault(menu, 0) + 1);
        }
    }

    public Map<Menu, Integer> getSaled() {
        return saled;
    }

    public int getSaledPrice() {
        int price = 0;
        for (Menu menu : saled.keySet()) {
            price += menu.getPrice() * saled.get(menu);
        }
        return price;
    }
}

package domain.Item;

import domain.Type;

import java.util.Map;

public class Ade extends Menu{
    private int price;
    private Map<String, Integer> options;

    private Type type = Type.ADE;

    public Ade(String name, String description, int price, Map<String, Integer> options) {
        super(name, description);
        this.price = price;
        this.options = options;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public Map<String, Integer> getOptions(){
        return options;
    }

    @Override
    public Type getType(){
        return type;
    }

}

package domain.Item;

public class Juice extends Menu{
    private int price;

    public Juice(String name, String description, int price) {
        super(name, description);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
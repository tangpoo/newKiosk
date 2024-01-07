package domain.Item;

public class Ade extends Menu{
    private int price;

    public Ade(String name, String description, int price) {
        super(name, description);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

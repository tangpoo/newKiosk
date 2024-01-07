package domain.Item;

public class Coffee extends Menu{
    private int price;

    public Coffee(String name, String description, int price) {
        super(name, description);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}

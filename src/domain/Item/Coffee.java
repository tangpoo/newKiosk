package domain.Item;

public class Coffee extends Menu{
    private int price;
//    private final String option;

    public Coffee(String name, String description, int price) {
        super(name, description);
        this.price = price;
//        this.option = option;
    }

    @Override
    public int getPrice() {
        return price;
    }
    @Override
    public void addOption(){
        this.price += 500;
    }

    /*
    @Override
    public String getOption(){
        return option;
    }
     */
}

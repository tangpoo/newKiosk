package domain.Item;

public abstract class Menu {
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getMenuName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract int getPrice();

}

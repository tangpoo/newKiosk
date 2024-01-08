package domain.Item;

import java.util.Objects;

public abstract class Menu {

    public int count = 1;
    private final String name;
    private final String description;

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

    public abstract void addOption();

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Menu other = (Menu) o;

        return other.name.equals(name)  && other.count == count && other.description.equals(description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, name, description); // import java.util.Objects; 가 필요함
    }
}


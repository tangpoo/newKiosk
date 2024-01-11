package domain;

import java.util.LinkedHashMap;
import java.util.Map;

//TODO 옵션 기능 구현
public class Option {
    private Map<String, Integer> adeOption;
    private Map<String, Integer> coffeeOption;
    private Map<String, Integer> juiceOption;

    public Option() {
        this.adeOption = addAdeOption();
        this.coffeeOption = addCoffeeOption();
        this.juiceOption = addJuiceOption();
    }

    public Map<String, Integer> addAdeOption() {
        Map<String, Integer> options = new LinkedHashMap<>();
        options.put("기본", 0);
        options.put("시럽 추가", 500);

        return options;
    }

    public Map<String, Integer> addCoffeeOption() {
        Map<String, Integer> options = new LinkedHashMap<>();
        options.put("기본", 0);
        options.put("샷 추가", 500);

        return options;
    }

    public Map<String, Integer> addJuiceOption() {
        Map<String, Integer> options = new LinkedHashMap<>();
        options.put("기본", 0);
        options.put("과일 추가", 1000);

        return options;
    }

    public Map<String, Integer> getAdeOption() {
        return adeOption;
    }

    public Map<String, Integer> getCoffeeOption() {
        return coffeeOption;
    }

    public Map<String, Integer> getJuiceOption() {
        return juiceOption;
    }

}

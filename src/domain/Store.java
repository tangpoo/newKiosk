package domain;

import domain.Item.Ade;
import domain.Item.Coffee;
import domain.Item.Juice;
import domain.Item.Menu;

import java.util.*;

public class Store {
    Menu ade1 = new Ade("청포도 에이드", "청포도가 들어간 에이드", 5500);
    Menu ade2 = new Ade("딸기 에이드", "딸기가 들어간 에이드", 5500);
    Menu ade3 = new Ade("레몬 에이드", "레몬이 들어간 에이드", 5500);

    Menu coffee1 = new Coffee("아메리카노", "에스프레소에 물 탄거다", 5000);
    Menu coffee2 = new Coffee("카페라떼", "아메리카노에 우유 탄거다", 5500);
    Menu coffee3 = new Coffee("카페모카", "카페라떼에 초코시럽을 뿌렸다", 5500);

    Menu juice1 = new Juice("오렌지 주스", "오렌지 주스이다", 6000);
    Menu juice2 = new Juice("딸기 주스", "딸기 주스이다", 6000);
    Menu juice3 = new Juice("포도 주스", "포도 주스이다", 6000);

    private final Map<Integer, List<Menu>> menuList = new LinkedHashMap<>();

    public Store() {
        menuList.put(1, new ArrayList<>(Arrays.asList(ade1, ade2, ade3)));
        menuList.put(2, new ArrayList<>(Arrays.asList(coffee1, coffee2, coffee3)));
        menuList.put(3, new ArrayList<>(Arrays.asList(juice1, juice2, juice3)));
    }


    //메뉴에 들어갈 상품을 만든다
    public List<Menu> getList (int key) {
        return menuList.get(key);
    }
}

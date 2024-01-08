package view;

import domain.Cart;
import domain.Item.Menu;
import domain.Saled;

import java.util.List;
import java.util.Map;

public class OutputView {

    public static void mainScreen(){
        System.out.println("1. ade");
        System.out.println("2. coffee");
        System.out.println("3. juice");
        System.out.println("4.주문하기 5.취소");
    }

    public static void showStoreList(List<Menu> store){
        for (int i = 0; i < store.size(); i++) {
            System.out.print(i + 1 + ". " + store.get(i).getMenuName());
            System.out.print(", 가격 W : " + store.get(i).getPrice());
            System.out.print(", 설명 : " + store.get(i).getDescription());
            System.out.println();
        }
    }

    public static void showMenu(Menu menu){
        System.out.print(menu.getMenuName());
        System.out.print(", 가격 W : " + menu.getPrice());
        System.out.print(", 설명 : " + menu.getDescription());
        System.out.println();
        System.out.println("1.구매 2.취소");
    }

    public static void addProductMessage(){
        System.out.println("상품이 추가되었습니다.");
    }


    public static void acceptOrder(List<Menu> cart, int price){
        for(Menu menu : cart){
            System.out.println("이름 : " + menu.getMenuName() + ", 수량 : " + menu.count + ", 가격 : W " + menu.getPrice() * menu.count);
        }

        System.out.println("최종 금액 : W " + price + "\n"
                + "주문을 하시겠습니까?\n"
                + "1.예 2.아니오");
    }

    public static void successOrder(int orderNumber){
        System.out.println("주문이 완료되었습니다!");
        System.out.println("대기 번호는 " + orderNumber + "번 입니다.");
        System.out.println("3초 후 메인화면으로 돌아갑니다.");
    }

    public static void askClearCart(){
        System.out.println("카트를 초기화 하시겠습니까?");
        System.out.println("1.예 2.아니오");
    }

    public static void showSales(int sales){
        System.out.println("[ 총 판매금액 현황 ]\n" +
                "현재까지 총 판매된 금액은 [ W " + sales + " ] 입니다.");
    }

    public static void showSaledMenu(Map<Menu, Integer> saled){
        for(Menu menu : saled.keySet()){
            System.out.println("- " + menu.getMenuName() + "     | W " + menu.getPrice());
        }
    }

    public static void askOption(){
        System.out.println("샷을 추가하시겠습니까? + W 500" + "\n"
         + "1.수락 2.거절");
    }

}


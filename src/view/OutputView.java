package view;

import domain.Cart;
import domain.Item.Menu;

import java.util.List;

public class OutputView {

    public static void mainScreen(){
        System.out.println("1. adeList");
        System.out.println("2. coffeeList");
        System.out.println("3. juiceList");
        System.out.println("4.주문하기 5.취소");
    }

    public static void showStoreList(List<Menu> store){
        for (int i = 0; i < store.size(); i++) {
            System.out.print(i + 1 + ". " + store.get(i).getMenuName());
            System.out.print(", 가격 : " + store.get(i).getPrice());
            System.out.print(", 설명 : " + store.get(i).getDescription());
            System.out.println();
        }
    }

    public static void showMenu(List<Menu> store, int idx){
        System.out.print(store.get(idx-1).getMenuName());
        System.out.print(", 가격 : " + store.get(idx-1).getPrice());
        System.out.print(", 설명 : " + store.get(idx-1).getDescription());
        System.out.println();
        System.out.println("1.구매 2.취소");
    }

    public static void addProductMessage(){
        System.out.println("상품이 추가되었습니다.");
    }


    public static void acceptOrder(List<Menu> cart, int price){
        for(Menu menu : cart){
            System.out.println("이름 : " + menu.getMenuName() + ", 가격 : " + menu.getPrice());
        }

        System.out.println("최종 금액 : " + price + "\n"
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


}


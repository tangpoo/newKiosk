package view;

import domain.Item.Menu;

import java.util.List;
import java.util.Map;

public class OutputView {

    public static StringBuilder sb = new StringBuilder();

    public void mainScreen(){
        System.out.println("1. ade");
        System.out.println("2. coffee");
        System.out.println("3. juice");
        System.out.println("4.주문하기 5.취소");
    }

    public void showStoreList(List<Menu> menuList){
        for (int i = 0; i < menuList.size(); i++) {
            sb.append(i + 1 + ". " + menuList.get(i).getMenuName());
            sb.append(", 가격 W : " + menuList.get(i).getPrice());
            sb.append(", 설명 : " + menuList.get(i).getDescription() + "\n");
        }
        System.out.println(sb);
        sb.setLength(0);
    }

    public void showMenu(Menu menu){
        System.out.print(menu.getMenuName());
        System.out.print(", 가격 W : " + menu.getPrice());
        System.out.print(", 설명 : " + menu.getDescription());
        System.out.println();
        System.out.println("1.구매 2.취소");
    }

    public void addProductMessage(){
        System.out.println("상품이 추가되었습니다.");
    }


    public void acceptOrder(List<Menu> cart, int price){
        for(Menu menu : cart){
            sb.append("이름 : " + menu.getMenuName() + ", 수량 : " + menu.count + ", 가격 : W " + menu.getPrice() * menu.count + "\n");
        }
        System.out.println(sb);
        sb.setLength(0);

        System.out.println("최종 금액 : W " + price + "\n"
                + "주문을 하시겠습니까?\n"
                + "1.예 2.아니오");
    }

    public void successOrder(int orderNumber){
        System.out.println("주문이 완료되었습니다!");
        System.out.println("대기 번호는 " + orderNumber + "번 입니다.");
        System.out.println("3초 후 메인화면으로 돌아갑니다.");
    }

    public void askClearCart(){
        System.out.println("카트를 초기화 하시겠습니까?");
        System.out.println("1.예 2.아니오");
    }

    public void showSales(int sales){
        System.out.println("[ 총 판매금액 현황 ]\n" +
                "현재까지 총 판매된 금액은 [ W " + sales + " ] 입니다.");
    }

    public void showSaledMenu(Map<Menu, Integer> saled){
        for(Menu menu : saled.keySet()){
            sb.append("- " + menu.getMenuName() + "     | W " + menu.getPrice() + "\n");
        }
        System.out.println(sb);
        sb.setLength(0);
    }

    public void askAdeOption(){
        System.out.println("시럽을 추가하시겠습니까? + W 500" + "\n"
                + "1.수락 2.거절");
    }

    public void askCoffeeOption(){
        System.out.println("샷을 추가하시겠습니까? + W 500" + "\n"
                + "1.수락 2.거절");
    }

    public void askJuiceOption(){
        System.out.println("과일을 추가하시겠습니까? + W 1000" + "\n"
                + "1.수락 2.거절");
    }

}


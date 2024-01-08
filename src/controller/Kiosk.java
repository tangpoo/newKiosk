package controller;

import domain.Cart;
import domain.Saled;
import domain.Store;

import domain.Item.Menu;
import exception.EmptyCartException;
import exception.WrongNumberException;
import order.Order;
import view.InputView;
import view.OutputView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static view.OutputView.showMenu;

public class Kiosk {

    private final Store store = new Store();;
    private final Cart cart = new Cart();
    private final Saled saled = new Saled();
    private List<Menu> menuList;
    private int orderNumber = 1;

    public void startKiosk(){
        while(true) {
            OutputView.mainScreen();
            int select = InputView.userInput();

            switch (select) {
                case 0:
                    OutputView.showSales(saled.getSaledPrice());
                    OutputView.showSaledMenu(saled.getSaled());
                    break;
                case 1, 2, 3:
                    showMenuList(select);
                    break;
                case 4:
                    orderCheck();
                    break;
                case 5:
                    cancel();
                    break;
                default:
                    WrongNumberException.wrongNumberException();

            }
        }
    }

    public void showMenuList(int key){
        menuList = store.getList(key);
        OutputView.showStoreList(menuList);
        addProduct();
    }

    public void addProduct(){
        int menuNum = InputView.userInput();
        OutputView.showMenu(menuList.get(menuNum - 1));
        int agree = InputView.userInput();

        if(agree == 1){
            Menu menu = menuList.get(menuNum - 1);
            OutputView.askOption();

            if(InputView.userInput() == 1){
                menu.addOption();

            }
            cart.addCart_option(menu);
            OutputView.addProductMessage();
        }

        startKiosk();
    }

    public void orderCheck(){
        if(cart.cartSize() != 0){
            OutputView.acceptOrder(cart.getCart() , Order.totalPrice(cart.getCart()));

            order(InputView.userInput());
        }
        else{
            EmptyCartException.emptyCartException();
        }
    }

    public void order(int select){
        if(select == 1){
            saled.addSaledList(cart.getCart());
            completeMessage();
        }
        else{
            startKiosk();
        }
    }

    public void completeMessage(){
        OutputView.successOrder(orderNumber++);
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
        }
        cart.clearCart();
        startKiosk();
    }

    public void cancel(){
        if(cart.cartSize() == 0){
            EmptyCartException.emptyCartException();
            startKiosk();
        }
        if(cart.cartSize() > 0){
            OutputView.askClearCart();

            if(InputView.userInput() == 1){
                cart.clearCart();
                startKiosk();
            }
            else{
                startKiosk();
            }
        }
    }
}
/*
1.추가 요구사항 구현
2.공간, 시간 복잡도 생각
2-1.list -> map 으로 변경 (조회시 list 보다 map이 훨씬 빠름, quantity 기능 구현 편리
3.입력 예외 처리
 */
package controller;

import domain.Cart;
import domain.Store;

import domain.Item.Menu;
import exception.EmptyCartException;
import exception.WrongNumberException;
import order.Order;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Kiosk {

    private final Store store = new Store();;
    private final Cart cart = new Cart();
    private List<Menu> menuList;
    private int orderNumber = 1;

    public void startKiosk(){
        while(true) {
            OutputView.mainScreen();
            int select = InputView.userInput();

            switch (select) {
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

    public void showMenuList(int select){
        menuList = store.getList(select);
        OutputView.showStoreList(menuList);
        showMenu(InputView.userInput());
    }

    public void showMenu(int select){
        OutputView.showMenu(store.getList(select), select);
        int agree = InputView.userInput();

        if(agree == 1){
            cart.addCart(menuList.get(select - 1));
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

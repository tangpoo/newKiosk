package controller;

import domain.Cart;
import domain.Item.Menu;
import domain.Saled;
import domain.Store;
import exception.EmptyCartException;
import exception.WrongNumberException;
import order.Order;
import view.InputView;
import view.OutputView;

import java.util.List;

public class Kiosk {
    private final Store store;
    private final Cart cart;
    private final Saled saled;
    private final Order order;
    private final OutputView outputView;

    public Kiosk() {
        this.store = new Store();
        this.cart = new Cart();
        this.saled = new Saled();
        this.order = new Order();
        this.outputView = new OutputView();
    }

    public void start() {
        while (true) {
            try {
                startKiosk();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void startKiosk() {
        outputView.mainScreen();
        int select = InputView.userInput();

        switch (select) {
            case 0:
                outputView.showSales(saled.getSaledPrice());
                outputView.showSaledMenu(saled.getSaled());
                break;
            case 1, 2, 3:
                addProduct(store.getList(select));
                break;
            case 4:
                orderCheck();
                break;
            case 5:
                cancel();
                break;
            default:
                throw new WrongNumberException();
        }
    }

    private void addProduct(List<Menu> menuList) {
        outputView.showStoreList(menuList);

        int menuNum = InputView.userInput();
        Menu menu = menuList.get(menuNum - 1);
        outputView.showMenu(menuList.get(menuNum - 1));

        int agree = InputView.userInput();
        if (agree == 1) {
            cart.addCart(menu);
            outputView.addProductMessage();
        }
    }

    private void orderCheck() {
        if (cart.cartSize() != 0) {
            outputView.acceptOrder(cart.getCart(), Order.totalPrice(cart.getCart()));

            order(InputView.userInput());
        } else {
            try {
                throw new EmptyCartException();
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void order(int select) {
        if (select == 1) {
            saled.addSaledList(cart.getCart());
            completeMessage();
        } else {
            startKiosk();
        }
    }

    private void completeMessage() {
        outputView.successOrder(order.getWaitingNumber());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        cart.clearCart();
        startKiosk();
    }

    private void cancel() {
        if (cart.sizeCheck()) {
            throw new EmptyCartException();
        }
        outputView.askClearCart();
        int ans = InputView.userInput();
        if (ans == 1) {
            cart.clearCart();
        } else if (ans != 2) {
            throw new WrongNumberException();
        }
    }
}
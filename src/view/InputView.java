package view;

import java.util.Scanner;

public class InputView {

    static Scanner sc = new Scanner(System.in);
    public static int userInput(){
        int select = Integer.parseInt(sc.nextLine());
        return select;
    }
}

package exception;

public class WrongNumberException extends RuntimeException{
    public WrongNumberException() {
        super("잘못된 선택 입니다.");
    }
}

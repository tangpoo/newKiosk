package exception;

//TODO 숫자 외의 입력 처리
public class NotNumberException extends NumberFormatException{

    public NotNumberException() {
        super("표시된 번호를 입력해주세요.");
    }
}

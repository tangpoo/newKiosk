//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import controller.Kiosk;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Kiosk kiosk = new Kiosk();
        kiosk.startKiosk();

        /*
        1.메뉴에 들어갈 상품을 만든다
        1-1.처음 보여질 상품의 카테고리를 출력하고, 입력을 기다린다

        2.사용자가 선택한 카테고리의 상품리스트 정보를 출력하고, 입력을 기다린다
        2-1.메뉴리스트를 작성한다 (이름, 가격, 설명)

        3.상품을 출력하고 구매(1), 취소(2) 의 입력을 기다린다
        3-1.구매하면 상품이 카트에 추가되고, 취소하면 상품 리스트 화면으로 돌아간다.
                                            (실패, 취소 -> 메인 화면으로 이동)

        4.첫 화면에서 구매를 누를시, 카트에 담겨있는 상품들을 주문한다
        4-1.카트에 담긴 상품의 이름과 가격, 총 가격이 출력된다.
        4-2.주문을 누르면 대기번호를 출력하고, 카트를 초기화 한다.
        */
    }
}

package C00Basic;

import java.util.Scanner;

public class C04IFStatements {
    public static void main(String[] args) {
//        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (answer == input){ //boolean값이 들어온다/
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
        //버스카드 예제
//        System.out.println("현재 가지고 계신 돈은 얼마인가요?");
//        Scanner sc = new Scanner(System.in);
//        int myMoney = sc.nextInt();
//        if,else if 구문에서 조건식은 택1로서, 한 조건에 해당하면 실행 후 전체구문 밖으로 나감.
//        조건의 순서가 중요함
//        if (myMoney >= 10000){
//            System.out.println("택시를 타시오");
//        }else if (myMoney >= 3000){
//            System.out.println("버스를 타시오");
//        } else if (myMoney >=2000) {
//            System.out.println("킥보드를 타시오");
//        }
//        else {
//            System.out.println("걸어가시오");
//        }

//        if문이 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면
//        모든 if문이 중복되어 실행될 가능성이 존재.
//        if (myMoney >= 10000){
//            System.out.println("택시를 타시오");
//        }
//        if (myMoney >= 3000){
//            System.out.println("버스를 타시오");
//        }
//        if (myMoney >=2000) {
//            System.out.println("킥보드를 타시오");
//        }
//        else {
//            System.out.println("걸어가시오");
//        }
        //      삼항연산자 : 결과값 = 조건식 ? 반환값1 : 반환값2
//        도어락키 예제
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        if (answer == input){ //boolean값이 들어온다/
//            System.out.println("문이 열렸습니다.");
//        }else {
//            System.out.println("비밀번호가 틀렸습니다.");
//        }
////        삼항연산자
//        String result = (answer == input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";
//        System.out.println(result);



//        switch문 : if, else if 등의 조건문을 가독성있게 표현 구문
//        switch ()
//        원하시는 서비스 번호를 입력해주세요
//        1번이면 대출업무입니다.
//        2번이면 예금업무입니다.
//        3번이면 적금업무입니다.
//        0이면 상담사연결입니다.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        if (num == 1){
            System.out.println("대출업무입니다.");
        }
        if (num == 2){
            System.out.println("예금업무입니다.");
        }
        if (num == 3){
            System.out.println("적금업무입니다.");
        }
        if (num == 0){
            System.out.println("상담사연결입니다.");
        }
        else {
            System.out.println("다시 입력하세요.");
        }


        switch (num){
            case 1:
                System.out.println("대출업무입니다.");
                break;
            case 2:
                System.out.println("예금업무입니다.");
                break;
            case 3:
                System.out.println("적금업무입니다.");
                break;
            case 0:
                System.out.println("상담사연결입니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }







    }
}

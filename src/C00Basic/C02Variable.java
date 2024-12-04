package C00Basic;

import java.math.BigDecimal;
import java.sql.SQLOutput;

public class C02Variable {
    public static void main(String[] args) {
//     // 정수 : byte(1바이트),int(4바이트),long(8바이트)
//
//        byte a = 127;
//        byte b = -128;
////        오버플로우
//        a++;
////        언더플로우
//        b--;
//        System.out.println(a);
//        System.out.println(b);
//
//        int intA = 10;
//        long longA = 10;
//        long은 명시적으로 L을 붙여 long타입임을 명시하기도 함
//        long longB = 10L;
//
////        실수 : float, double(기본형)
//        float f1 = 1.123f;
//        double d1 = 1.123;
//       부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//
//    소수점이 누적됐을 때 유의미한 오차 발생
//        double total = 0;
//        for (int i =  0; i < 1000; i++){
//            total += 0.1;
//        }
//        System.out.println(total);
//
//        // 소수점 오차 해결방법 : 정수로 변환 후 연산하여 추후 나눗셈으로 해결
//
//        double total2 = 0;
//        for (int i =  0; i < 1000; i++){
//            total2 = total2 + 0.1*10;
//        }
//        System.out.println(total2/10);
//
//        소수점 오차 해결 방법 : Bigdecimal 클래스 사용
//        double doble1 = 1.03;
//        double doble2 = 0.42;
//        System.out.println(doble1-doble2);
//        BigDecimal bd1 = new BigDecimal("1.03");
//        BigDecimal bd2 = new BigDecimal("0.42");
//        double r = bd1.subtract(bd2).doubleValue();
//        System.out.println(r);

        // 문자형 char
//        char ch1 = '가';
//        System.out.println(ch1);

//      boolean : true or false
//        boolean b1 = true;
//        System.out.println(b1);

//        boolean타입은 대부분 조건절에 사용
//        if(10>0){
//            System.out.println("참입니다.");
//        }

//      null도 하나의 타입       .."" = 공백임 // 기본형에는 null안됌
//        String str1 = null;
//        String str2 = "";

//        타입변환
//        묵시적타입변환
//        char ch1 = 'a';
//        int intA = ch1;
//        System.out.println(intA);
//
////        알파벳 배교를 위한 묵시적 타입변환
//        System.out.println('a' > 'b');
//
////        알파벳소문자 제거 문제
//        String st1 = "01abcd123한글123";
//        String answer = "";
//        for (int i = 0; i < st1.length(); i++){
//            if(st1.charAt(i) < 'a' || st1.charAt(i) > 'z'){
//                answer = answer + st1.charAt(i);
//            }
//        }
//        System.out.println(answer);
//
//
//
//
//
//
//
//
//
////        int -> dobble 형변환 : 문제없음
//        int i1 = 10;
//        double d1 = i1;
//
////         double -> int 형변환
//        double d2 = 10.5;
//        int i2 = (int)d2;
//
//        //정수/정수의 경우 소수점 절사 문제 발생
//        int a = 1;
//        int b = 4;
//        double d = a/b;
//        System.out.println(d); //0
////        두 정수중에 한 정수만이라도 double형변환시 소수점 절사 문제 해결
//        double c = (double) a/b;
//        System.out.println(c);

//        변수와 상수
//        int a1 = 10;
////        재선언은 불가능
////        int a1 = 20;
////        변수값 재할당은 가능
//        a1 =20;
//        System.out.println(a1);
//
//        // 상수는 초기값을 이후에 재할당하는 것이 불가능
//        // 상수는 final키워드를 통해 표현
//        final int AGES = 20;
//        AGES = 30;


















    }
}


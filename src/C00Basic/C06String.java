package C00Basic;

import java.util.ArrayList;
import java.util.List;

public class C06String {
    public static void main(String[] args) {
//        //        참조자료형 : 기본 자료형을 제외한 모든 자료형. 클래스 기반
////        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int a = 10;
//
//        Integer b = new Integer(10);
////        오토 언박싱 : wrapperclass -> 기본자료형
//        int c = b;
////        오토 박싱 : 기본자료형 -> wrapperclass 형변환
//        Integer d = a;

//       String과 int의 형변환
//        int a = 10;
//        String st1 =Integer.toString(a);
//        String st2 = String.valueOf(a);
//

//        String -> int
//                int b = Integer.parseInt(st1);
//        배열에는 원시타입 자료형 세팅
//        int[] arr1 = {10,20,30};
//        리스트에는 참조자료형 세팅
//        참조자료형에 원시자료형을 담을때는 wrapper클래스를 써야함
//        List<Integer> list1 = new ArrayList<>();
//        list1.add()
////        st2는 객체
////        String은 클래스
//
//
//
//        String st1 = new String("hello1");
//        String st2 = "hello1"; //리터럴방식 허용 : 권장되는 방식
//        문자 pool을 통해 성능향상

////        성능최적화
//        System.out.println(st1==st2);
//
//
//        char ch1 = '가';
//        char ch2 = '가';
//        System.out.println(ch1==ch2);
//
//        String a = "1";
//        String b = "1";
//        System.out.println(a == b);
//
//        String st3 = new String("hello1");
//        String st4 = "hello1";
////        참조자료형이므로, ==비교는 메모리 주소가 되고, 값을 비교할때에는 .equals 사용
//        System.out.println(st3.equals(st4));



//        equals 중에 대소문자 무시 :
//        String st1 = "hello1";
//        String st2 = "hello1";
//        String st3 = "Hello1";
//        System.out.println(st1.equals(st2));
//        System.out.println(st2.equals(st3));
//        System.out.println(st2.equalsIgnoreCase(st3));
//

//        문자열의 길이 : length()
//        String st1 = "hello1 java1 world2";
//        System.out.println(st1.length());
////        charAt : 특정 인덱스의 문자값을 리턴
////        소문자알파벳의 개수
//        int cnt = 0;
//        for (int i=0; i< st1.length();i++){
//            if (st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z'){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);

//        int count = 0;
       String st2 = "abcdefabaad";
////        a의 개수 세기
//        for (int i = 0; i <st2.length();i++){
//            if (st2.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

//            int c = 0;
////        toCharArray() : String 문자열을 char배열로 리턴
//         char[] chArr = st2.toCharArray();
//         for (int i = 0; i < chArr.length;i++){
//             if (chArr[i] == 'a'){
//                 c++;
//             }
//         }
//        System.out.println(c);



    String st1 ="hello java java";
//    indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치
        System.out.println(st1.indexOf("java"));


//contains : 특정 문자열이 있는지 여부 boolean
        System.out.println(st1.contains("hello"));
        System.out.println(st1.contains("world"));








    }
}

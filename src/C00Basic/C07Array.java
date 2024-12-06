package C00Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C07Array {
    public static void main(String[] args) {
//         배열표현식1 .리터럴 방식
//        int[] intArr1 = {1,3,5,7,9};
//
////        배열표현식2. 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 3;
//        intArr2[2] = 5;
//        intArr2[3] = 7;
//        System.out.println(intArr2[4]);
//
////        참조자료형의 배열은 기본적으로 null초기화
//        String[] stArr = new String[5];
//        stArr[0]  = "hello1";
//        stArr[1]  = "hello2";
//        stArr[2]  = "hello3";
//        //아래코드는 nullpointerexception발생
//        for (int i = 0; i<stArr.length;i++){
//            if (stArr[i].equals("hello")){
//                System.out.println("ddd");
//            }
//        }

//        표현식3
//        int[] intArr3 = new int[]{1,2,5,3,6,7};
//        List<int[]> list1 = new ArrayList<>();
//        list1.add(new int[]{1,2,5,3,6,7});

//표현식4: 불가 -> 배열의 길이가 사전 지정되어야 함
//        int[] intArr4 = new int[];

//        String[] stArr = new String[5];
//        for (int i = 0; i < stArr.length;i++){
//            stArr[i] = "";
//        }
//
//        Arrays.fill(stArr,"hello");
//        System.out.println(Arrays.toString(stArr));

// 85,65,90인 int배열을 선언하고 총합 평균구하기
//        int[] arr = {85,65,90};
//        int sum = 0;
//        int avg = 0;
//        for (int i= 0; i < arr.length;i++){
//            sum += arr[i];
//            avg = sum/arr.length;
//        }
//        System.out.println(avg);

// 배열의 최댓값 최솟값
//        int[] arr2 = {10,20,30,12,8,17};
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < arr2.length;i++){
//            if (min > arr2[i]){
//                min = arr2[i];
//            } else if (max < arr2[i]) {
//                max = arr2[i];
//            }
//        }
//        System.out.println("max : " + max + " min : " + min);


//배열 자리바꾸기
//int[] arr = {20,10,30};
////swich문제
//        int[] arr2 = {10,20,30,40,50};
//        for (int i = 1; i < arr2.length; i++){
//            int temp = arr2[i-1];
//            arr2[i-1] = arr2[i];
//            arr2[i] = temp;
//        }

//        System.out.println(Arrays.toString(arr2));
//        for (int i = 0; i < arr2.length;i++){
//            for (int j = 1; j < arr2.length; j++){
//                int temp = arr2[j-1];
//                arr2[j-1] = arr2[j];
//                arr2[j] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr2));

// 배열뒤집기
//        int[] arr = {10,20,30,40,50};
//        for (int i = 0; i< arr.length;i++){
//            for (int j = 0; j< arr.length-1;j++){
//                if (arr[j]<arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//

//        배열의 정렬

//        int[] arr ={17,12,20,10,25};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        선택정렬
//        최솟값으로 정렬










//
//        for (int i = 0;i < arr.length; i++){
//            for (int j = i + 1; j < arr.length; j++){
//                if (arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));


//        문자정렬
////        아스키코드기준으로 정렬
//        String[] fruits ={"banan","apple","cherry"};
////        오름차순
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));

//        String[] fruits2 = {"apple","applee","applef","b"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));





//        내림차순 : 기본형 타입은 Comparator로 처리 불가
//        Arrays.sort(fruits, Comparator.reverseOrder());
//        int[] arr4 ={5,1,2,3,6};
////        Arrays.sort9arr, Comparator.reverseOrder());
//        Arrays.sort(arr4);




//k번째수 프로그래머스
        int[] array = {1,5,2,6,3,7,4};
        int[][] command = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[command.length];

        for (int i = 0; i < command.length;i++){
            int[] temp = new int[command[i][1]-command[i][0]+1];
        }













//        for (int i = 0; i< arr.length;i++){
//            for (int j = 0; j< arr.length-1;j++){
//                if (arr[j]<arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//
//                }
//            }
//        }































































    }
}

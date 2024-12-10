package C00Basic;

import com.sun.security.jgss.GSSUtil;

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
//        int[] array = {1,5,2,6,3,7,4};
//        int[][] command = {{2,5,3},{4,4,1},{1,7,3}};
//        int[] answer = new int[command.length];
//
//        for (int i = 0; i < command.length;i++){
//            int[] temp = new int[command[i][1]-command[i][0]+1];
//        }


//숫자 조합의 합
//       모두 각기 다른 숫자의 배열이 있을때, 만들어질 수 있는 2개의 조합의 배열에 담아
//        int[] intArr = {10,20,30,40,50,60};
//        int[] arr1 = new int[intArr.length * intArr.length];
//        int index = 0;
//        for(int i=0; i<intArr.length; i++){
//            for(int j=i+1; j< intArr.length; j++){
//                arr1[index] = intArr[i]+intArr[j];
//                index++;
//            }
//        }

//        System.out.println(Arrays.toString(arr1));
//        int[] arr2 = new int[index];
//        for(int i=0; i<index; i++){
//            arr2[i] = arr1[i];
//        }
//        Arrays.sort(arr2);
//        System.out.println(Arrays.toString(arr2));
//
//
//        int[] arr3 = new int[arr2.length];
//        int count = 0;
//        for(int i=0; i<arr2.length; i++){
//            if(i==arr2.length-1 || arr2[i] != arr2[i+1]){
//                arr3[count] = arr2[i];
//                count++;
//            }
//        }

//배열의 복사
//        Arrays.copyOF(배열명, length), copyOfRange(배열명, start, end)
//        int[] answer1 = Arrays.copyOf(arr3,count);
//        int[] answer2 = Arrays.copyOfRange(arr3,0,count);
//        System.out.println(Arrays.toString(answer1));
//        System.out.println(Arrays.toString(answer2));


//두개의 수 뽑아서 더하기
//        int[] numbers = new int[]{2,1,3,4,1};
//                int[] answer = new int[numbers.length*numbers.length];
//                int[] temp = new int[20];
//                int[] arr2 = new int[20];
//                for (int i = 0; i < numbers.length-1;i++){
//                    temp[i] = numbers[i] + numbers[i+1];
//            }
//                int index2 = 0;
//                for (int i = 0; i < temp.length-1;i++){
//                    if (temp[i] != temp[i+1]){
//                        arr2[index2] = temp[i];
//                        index2++;
//                    }
//        }
//         answer = Arrays.copyOfRange(arr2,0,index2);
//        System.out.println(Arrays.toString(answer));







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



// 배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int target = 8;
//
//        for (int i = 0;i <arr.length;i++){
//            if (arr[i] == target){
//                System.out.println(target+"은 배열에 " +i + "번째에 있다");
//            }
//        }



//이진검색(binary search) - 이분탐색
//        사전에 오름차순정렬이 되어 있어야 이진검색 가능
//        수찾기
//        int[] arr = {1,3,6,8,9,11,15};
//        System.out.println(Arrays.binarySearch(arr,15));

//          배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1 == arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));


//          2차원배열의 선언과 할당
//        int[][] arr1 = new int[2][3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[0][2] = 30;
//        arr1[1][0] = 40;
//        arr1[1][1] = 50;
//        arr1[1][2] = 60;
//
//        int[][] arr2 = {{10,20,30},{40,50,60}};
//
//
//
////      가변 배열선언 후 할당
//        int[][] arr1 = new int[2][];
//        arr1[0] = new int[2];
//        arr1[1] = new int[3];
//        arr1[0][0] = 10;
//        arr1[0][1] = 20;
//        arr1[1][0] = 30;
//        arr1[1][1] = 40;
//        arr1[1][2] = 50;
//
//
////        가변배열 리터럴 방식
//        int[][] arr2 = {{10,20,30},{40,50,60}};
//
//
////        [3][4]사이즈 배열 선언하고
////        1~12까지 숫자값을 각 배열에 순차적으로 할당
////        [1,2,3,4],[5,6,7,8]...
//        int count = 1;
//        int[][] arr3 = new int[3][4];
//        for (int i = 0; i< arr3.length;i++){
//            for (int j = 0; j < arr3[i].length;j++){
//                arr3[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr3));

//
//        int count2 = 1;
//        int[][] arr = new int[3][];
//        for (int i = 0; i< arr.length;i++){
//            for (int j = 0; j < arr[i].length;j++){
//                arr[i][j] = count2;
//                count2++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));



        int[][] arr1 = new int[2][2];
        int[][] arr2 = new int[2][2];
        int[][] answer = new int[arr1.length][arr1.length];

        for (int i = 0; i < arr1.length;i++){
            for (int j = 0; j < arr1[i].length;j++){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(answer));





























    }
}

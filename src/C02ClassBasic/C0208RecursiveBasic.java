package C02ClassBasic;

public class C0208RecursiveBasic {
    public static void main(String[] args) {
//        for문으로 1~10까지 누적합계
        int total = 0;
        for (int i = 1;i<11;i++){
            total += i;
        }
        System.out.println(total);
//        재귀함수로 1~10까지 누적합계
        System.out.println(sumAcc(10));

//        factorial 값 구하기
//        factorial(5) ->
        System.out.println(factorial(10));

//        피보나치 수열 구현 : 100번째
//        1 1 2 3 5 8





    }
    public static int fibonacci(int a, int b){
        int c = 0;
        for (int i = 0; i<10;i++){
            c =a+b;
            a = b;
            b = c;
        }return c;
    }

    public static int fibonacci2(int n){
        if (n <=2){
            return 1;
        }
        return factorial(n-1) + factorial(n-2);
    }



    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }



    public static int sumAcc(int n){
        if (n ==1){
            return 1;
        }
        return n+sumAcc(n-1);
    }
}

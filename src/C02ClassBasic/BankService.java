package C02ClassBasic;

import java.util.*;

public class BankService {
    public static void main(String[] args) {
//        프로그램은 항상 실행될 수 있도록 전체코드르 while(true)로 처리
//        서비스번호를 입력하세요. 1.개설 2.조회. 3.입금 4.출금 5.송금
//        1. 개설: 계좌번호와 현재가지고 계신돈을 입력하세요.
//        2. 조회: 계좌번호를 입력하세요.
//        3. 입금: 계좌입금서비스입니다. 계좌번호와 입금금액을 입력하세요.
//        4. 출금: 계좌출금서비스입니다. 계좌번호와 출금금액을 입력하세요.
//        5. 송금: 계좌송금서비스입니다. 내 계좌번호,상대 계좌번호와 송금금액을 입력하세요.
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("서비스번호를 입력하세요. 1.개설 2.조회. 3.입금 4.출금 5.송금");
            String input = sc.nextLine();
            if(input.equals("1")){
                System.out.println("계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                System.out.println("계좌금액을 입력해주세요");
                int money = Integer.parseInt(sc.nextLine());
                BankAccount ba = new BankAccount(accountNumber, money);
                System.out.println(ba.getBalance());
            } else if (input.equals("2")) {
                System.out.println("조회입니다. 계좌번호를 입력해주세요");
                String accountNumber = sc.nextLine();
                for (BankAccount account : BankAccount.list2) {
                    System.out.println(account.getBalance());
                }


            }
        }
}

// Account객체 : 자체ID값(자동 INCREMENT), 계좌번호, 잔액 변수로 구성

    static class BankAccount{
    static long static_ID = 0L;
    private String AcNum;
    private int balance = 0;
    private long id;
    static List<BankAccount> list2 = new ArrayList<>();

    public BankAccount(String acNum, int balance) {
        AcNum = acNum;
        this.balance = balance;
        id = static_ID++;
        list2.add(this);
    }

    public String getAcNum() {
        return AcNum;
    }

    public int getBalance() {
        return balance;
    }

    public long getId() {
        return id;
    }

    public static List<BankAccount> getList2() {
        return list2;
    }

}
}
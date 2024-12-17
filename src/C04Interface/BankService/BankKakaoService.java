package C04Interface.BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount ba) {
        System.out.println(money + "카카오로 입금되었습니다.");
        int balance = ba.getBalance() + money;
        ba.updateBalance(balance);
    }

    @Override
    public void withdraw(int money, BankAccount ba) {
        System.out.println(money + "카카오로 출금되었습니다.");
        int balance = ba.getBalance() - money;
        ba.updateBalance(balance);
    }
    //    입금시 : xx원 카카오로 입금되었습니다.
//    현재 잔액은 yy원입니다.

//    출금시 : xx원 카카오로 출금되었습니다.
//      현재 잔액은 yy원입니다.

}
package C04Interface.BankService;

public class BankAccount {

    private String accountNumber;
    private int balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void updateBalance(int balance){
        this.balance = balance;
        System.out.println("현재 잔액은 : " +balance);
    }
}

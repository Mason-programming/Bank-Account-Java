import javax.swing.*;
public class BankAccount {

    // varibles for bank account
    protected int accountNumber;
    protected double balance;
    protected double deposit;
    protected double withdraw;
    protected double afterDeposit;
    protected double afterWithdraw;

    // constructor
    public BankAccount(double num, int account){
        accountNumber = account;
        balance = num;
    }
    public void setAccountNumber(int number){ accountNumber = number; }

    public void setDeposit(double depo){
        deposit = depo;
        deposit(deposit);
    }
    //
    public double getDeposit(){ return deposit; }

    public int getAccountNumber(){ return accountNumber; }

    public double getBalance(){ return balance; }

    public void setBalance(double set){ balance = set; }

    public void setWithdraw(double with){
        withdraw = with;
        withdraw(withdraw);
    }

    // set the balance after a withdraw
    public void withdraw(double with){ afterWithdraw = afterDeposit - with; }

    // gets the withdraw balance
    public double getAfterWithdraw(){ return afterWithdraw; }

    public void deposit(double dep){ afterDeposit =  balance + dep; }

    public double getAfterDeposit(){ return afterDeposit; }

    public void print(){
        System.out.println("Beginning balance of the account \n" +
                " account ACCT#: " + getAccountNumber() +  " Balance: " + getBalance()
               );
    }

}

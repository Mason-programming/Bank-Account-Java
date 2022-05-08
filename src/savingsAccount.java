import javax.swing.*;

public class savingsAccount extends checkingAccount{

    public savingsAccount(double num, int account) {
        super(num, account);
        interestRate = 0.06;
    }
    public double getPostBalance(){ return postBalance; }

    @Override
    public double getInterestRate(){ return interestRate; }

    @Override
    public void withdraw(double amount){ afterWithdraw = balance -= amount; }

    @Override
    public void postInterest(){
        double interest = interestRate * afterDeposit;
       postBalance =  afterDeposit + interest;
    }
    @Override
    public void print(){
        JOptionPane.showMessageDialog(null,"Beginning balance Savings account \n" +
                           "Savings account ACCT#: " + getAccountNumber() +  " Balance: " + getBalance() + "\n" +
                           "Savings account after deposit of " + getDeposit() + "\n" +
                             "Savings ACCT#: "+ getAccountNumber() + " Balance: " + getAfterDeposit() +
                            " The interest rate is " + getInterestRate() + "\n" +
                            " Savings account after interest " + "\n" +
                            "Savings ACCT#: " + getAccountNumber() + " Balance: " + getPostBalance());
    }
}

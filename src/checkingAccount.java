import javax.swing.*;

public class checkingAccount extends BankAccount{
    // varibles unique to checking account
    protected double interestRate;
    protected double minimumBalance;
    protected double serviceCharge;
    protected double postBalance;

    public checkingAccount(double num, int account) {
        super(num, account);
    }
    // set the varibles in checking account
    public void setMinimumBalance(double min){ minimumBalance = min; }

    public void setInterestRate(double rate){ interestRate = rate;}

    public void setServiceCharge(double servie){ serviceCharge = servie; }

    // get the varibles from checking account
    public double getMinimumBalance(){ return minimumBalance; }

    public double getInterestRate(){ return interestRate; }

    public double getServiceCharge(){
        return serviceCharge;
    }

    // find the balance post interest
    public void postInterest(){
        double interest = interestRate * afterDeposit;
        postBalance =  afterDeposit + interest;
    }

    // Checks if the minimum balance is greater than the balance after the withdraw
    public boolean verifyMinimumBalance(){
        boolean check = false;
        if(minimumBalance < afterWithdraw)
            check = true;
        else
            check = false;
        return check;
    }
    @Override
    public void print(){
        if(verifyMinimumBalance() == false){
            JOptionPane.showMessageDialog(null,"Beginning balance Checking account \n" +
                    "Checking account ACCT#: " + getAccountNumber() +  " Balance: " + getBalance() + "\n" +
                    "The minimum balance is  " + getMinimumBalance() + "\n"+
                    "Service charge is " + getServiceCharge() + "\n"+
                    "Checking account after deposit of " + getDeposit() + "\n" +
                    "Checking ACCT#: " + getAccountNumber() + " Balance: " + getAfterDeposit() + "\n" +
                    "After this transaction, the balance will be below the minimum balance, Service charges will apply." + "\n" +
                    "Checking account ACCT#: " + getAccountNumber() + " Balance: $" + getAfterWithdraw());
        }else if (verifyMinimumBalance() == true){
            JOptionPane.showMessageDialog(null,"Beginning balance Checking account \n" +
                    "Checking account ACCT#: " + getAccountNumber() +  " Balance: " + getBalance() + "\n" +
                    "The minimum balance is  " + getMinimumBalance() + "\n"+
                    "Service charge is " + getServiceCharge() + "\n"+
                    "Checking account after deposit of " + getDeposit() + "\n" +
                    "Checking ACCT#: " + getAccountNumber() + " Balance: " + getAfterDeposit() + "\n" +
                    "Checking account ACCT#: " + getAccountNumber() + " Balance: $" + getAfterWithdraw());
        }
    }
}

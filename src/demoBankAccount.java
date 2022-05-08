import javax.swing.*;
import java.util.Locale;

public class demoBankAccount {

   public static void main(String[] args) {
       String intAccount, intBalance, intDepo, intWith, answer;
       double bal;
       int account;
       double deposit, withdraw;

        // allow users to input their chose of a "savings" account or "checking" account
       answer = JOptionPane.showInputDialog("Would you like checking or savings", null);
       answer = answer.toLowerCase();

       // check if the answers from the input are "savings" or "checking"
       if(answer.equals("savings")){
           // allow users to input there savings account data
           intAccount = JOptionPane.showInputDialog("Enter Savings account Number", null);
           intBalance  = JOptionPane.showInputDialog("Enter the balance", null);
            intDepo = JOptionPane.showInputDialog("How much would you like to deposit " ,null);

            // parse through strings to find numbers
            deposit = Double.parseDouble(intDepo);
           bal = Double.parseDouble(intBalance);
           account = Integer.parseInt(intAccount);

           // instantiate the new savings account object to you class
           savingsAccount newSavings = new savingsAccount(bal,account);
           newSavings.setDeposit(deposit);
           newSavings.postInterest();
           newSavings.print();
       } else if (answer.equals("checking")){
           // allow users to input there checking account data
           intAccount = JOptionPane.showInputDialog("Enter Checking account Number", null);
           intBalance  = JOptionPane.showInputDialog("Enter the balance", null);
           intDepo = JOptionPane.showInputDialog("How much would you like to deposit " ,null);
           intWith = JOptionPane.showInputDialog("How much would you like to withdraw " ,null);

           // parse through strings to find numbers
           withdraw = Double.parseDouble(intWith);
           deposit = Double.parseDouble(intDepo);
           bal = Double.parseDouble(intBalance);
           account = Integer.parseInt(intAccount);

           checkingAccount newChecking = new checkingAccount(bal,account);

           // setting some of the varibles in checking account
           newChecking.setMinimumBalance(500);
           newChecking.setInterestRate(0.06);
           newChecking.setServiceCharge(20);

           newChecking.setDeposit(deposit);
           newChecking.setWithdraw(withdraw);
           newChecking.print();
       }
   }
}

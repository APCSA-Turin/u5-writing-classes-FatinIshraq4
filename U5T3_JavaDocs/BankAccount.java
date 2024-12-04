/**
 * This class represents a BankAccount object
 *
 * @author Fatin Ishraq
 */

public class BankAccount{
    /** The type of account of the BankAccount*/
    private String accountType;
    /** The balance of the BankAccount*/
    private double balance;

    /**
     * Instantiates a BankAccount object.
     *
     * @param typ The account type
     * @param bal The balance
     */
    public BankAccount (String typ, double bal) {
      accountType = typ;
      balance = bal;
    }
 

    /**
     * Returns the current balance of the BankAccount.
     *
     * @return The balance of the BankAccount
     */
    public double getBalance() {return balance;}
  
 


    /**
     * Updates value of balance in BankAccount by adding a value as long as the account is not overdrawn
     *
     * @param amount The amount to be added to balance
     */
    public void deposit(double amount) {
      double i = Math.round(amount * 10) / 10.0;
      if (balance>=0) {balance+=i;}

    }

    /**
     * Updates value of balance in BankAccount by subtracting a value as long as the account is not overdrawn
     *
     * @param amount The amount to be subtracted from balance
     */
    public void withdraw(double amount) {
      double i = Math.round(amount * 10) / 10.0;
      if (balance>=0 && balance-i>=0) {balance-=i;}
    }

}
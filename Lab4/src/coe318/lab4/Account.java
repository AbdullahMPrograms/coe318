/**
 *
 * @author Abdullah Malik
 */
package coe318.lab4;
public class Account {

    private String name;
    private int number;
    private double balance;

    /**
     * Constructs an Account object with the specified name, account number, and balance.
     *
     * @param name the name of the account holder
     * @param number the account number
     * @param balance the initial balance of the account
     */
    public Account(String name, int number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    /**
     * Returns the name of the account holder as a string.
     *
     * @return the name of the account holder as a string
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the current balance of the account.
     *
     * @return the current balance of the account
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the account number.
     *
     * @return the account number
     */
    public int getNumber() {
        return number;
    }

    /**
     * Deposits the specified amount into this account.
     * 
     * @param amount the amount to deposit
     * @return true if the deposit was successful, false otherwise
     */
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Withdraws a specified amount from the account balance.
     * 
     * @param amount the amount to withdraw from the account balance
     * @return true if the withdrawal was successful, false otherwise
     */
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {// DO NOT MODIFY
        return "(" + getName() + ", " + getNumber() + ", " +
                String.format("$%.2f", getBalance()) + ")";
    }
}

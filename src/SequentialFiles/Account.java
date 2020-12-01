package SequentialFiles;

public class Account {
    private int accountNumber;
    private String firstName;
    private String lastName;
    private double balance;

    //initializes an Account with default values
    public Account() {
        this(0, " ", " ", 0.0);
    }

    public Account(int accountNumber, String firstName, String lastName, double balance) {
        this.accountNumber = accountNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    //set AccountNumber
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    //get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    //set first name
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //get first name
    public String getFirstName() {
        return firstName;
    }

    //set lastname
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    //get lastname
    public String getLastName() {
        return lastName;
    }

    //set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }


}

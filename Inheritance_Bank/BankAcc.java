package Inheritance_Bank;

public class BankAcc {
    private String accName;
    private String accNumber;
    private double balance;
    public BankAcc(String accName, String accNumber, double balance){
        this.accName= accName;
        this.accNumber=accNumber;
        this.balance=balance;
    }

    public String getAccName() {
        return this.accName;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            System.out.println("Insufficient Balance!");
            return false;
        } else {
            System.out.println("Successfully debited amount: "+amount);
            System.out.println("Current Balance: "+this.getBalance());
            return true;
        }
    }
    public String getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
        return balance;
    }
    protected void setBalance(double balance){
        this.balance= balance;
    }

}

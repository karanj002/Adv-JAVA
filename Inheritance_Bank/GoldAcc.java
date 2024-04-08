package Inheritance_Bank;

public class GoldAcc extends BankAcc{
    private double overDraftLimit;
    public GoldAcc(String accNumber, String accName, double balance, double overDraftLimit){
        super(accName,accNumber,balance);
        this.overDraftLimit= overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public boolean overDraftWithdrawal(double amount, double balance) {
        if (balance + this.overDraftLimit >= amount) {
            double overdraftUsed = amount - balance;
            this.overDraftLimit -= overdraftUsed;
            System.out.println("Current bal: " + this.getBalance());
            return true;
        } else {
            System.out.println("Overdraft limit exceeded");
            return false;

        }
    }
}

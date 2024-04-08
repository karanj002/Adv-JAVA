package Threading;

public class AccSynchro {
    public int bal;
    public int accNo;
    void dispBal(){
        System.out.println("Bal =" +bal+ "For accNo =" +accNo);
    }
    void deposit(int amt){
        bal+=amt;
        System.out.println("Deposit");
        dispBal();
    }
    void withdraw(int amt){
        bal-=amt;
        System.out.println("Withdrawn");
        dispBal();
    }
}

package Threading;

public class SynchroMain {
    public static void main(String[] args) {
        AccSynchro acc1=new AccSynchro();
        acc1.bal=1000;
        acc1.accNo=1;
        transDeposit t1;
        transWithdraw t2;
        t1=new transDeposit(acc1, 300);
        t2=new transWithdraw(acc1, 200);
    }
}

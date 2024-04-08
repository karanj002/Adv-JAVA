package Threading;

public class transWithdraw implements Runnable {
    int amount;
    AccSynchro acc;

    transWithdraw(AccSynchro x, int amt) {
        acc = x;
        amount = amt;
        new Thread(this).start();
    }

    @Override
    public void run() {
        acc.withdraw(amount);
    }
}
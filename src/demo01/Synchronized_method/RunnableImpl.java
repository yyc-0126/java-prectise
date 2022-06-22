package demo01.Synchronized_method;

public class RunnableImpl implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while(true) {
            payTickets();
        }
    }
    public synchronized void payTickets() {
        if (ticket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
            ticket--;
        }
    }
}

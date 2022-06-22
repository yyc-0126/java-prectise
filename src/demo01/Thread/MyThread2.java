package demo01.Thread;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"run:"+i);
        }
    }
}

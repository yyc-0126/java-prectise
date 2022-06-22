package demo01.Thread;

public class Demo01Thread{
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();

//        MyThread mt2 = new MyThread();

//        mt2.start();

//        System.out.println(Thread.currentThread());

//        for (int i = 0; i < 20; i++) {
//
//            System.out.println("main:" + i);
//        }
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(mt2);
        t.start();


    }

}

package demo01WaitAndNotify;

public class DemoWaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while(true) {
                    synchronized (obj) {
                        System.out.println("告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，吃包子");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while(true) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj) {
                        System.out.println("老板5秒后做好包子，告知顾客可以吃包子了");
                        obj.notify();
                    }
                }
            }
        }.start();


    }
}

package demo01WaitAndNotify;

public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                while(true) {
                    synchronized (obj) {
                        System.out.println("1告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，1吃包子");
                    }
                }
            }
        }.start();

        Thread thread3 = new Thread() {
            @Override
            public void run() {
                while(true) {
                    synchronized (obj) {
                        System.out.println("3告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，3吃包子");
                    }
                }
            }
        };
        thread3.start();


        new Thread() {
            @Override
            public void run() {
                while(true) {
                    synchronized (obj) {
                        System.out.println("2告知老板要的包子的种类和数量");
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("包子已经做好了，2吃包子");
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
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}

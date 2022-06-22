package demoBaozi;

/*
包子铺和吃包子线程关系：通信（互斥）
必须使用同步技术保证两个线程只能有一个在执行
锁对象必须保证唯一，可以使用包子对象作为锁对象
包子铺类和吃包子类需要把包子对象作为参数传递进来
      1.需要在成员位置创建一个包子变量
      2.使用带参构造方法，为这个包子变量赋值
*/

public class BaoZiPu extends Thread {
    private BaoZi bz;

    public BaoZiPu(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                bz.pi = "皮";
                bz.xian = "猪肉";
                System.out.println("包子铺正在生产：" + bz.pi + bz.xian + "包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("生产完毕");
            }
        }
    }
}

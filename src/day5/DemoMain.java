package day5;

public class DemoMain {

    public static void main(String[] args) {
        // 首先创建笔记本
        Computer computer = new Computer();
        computer.powerOn();

        // 准备一个鼠标，供电脑使用
//        Mouse mouse = new Mouse();
        // 首先进行向上转型
        USB usbMouse = new Mouse();
        // 参数是usb类型
        computer.useDevice(usbMouse);

        // 创建一个usb键盘
        Keyboard keyboard = new Keyboard(); // 没有用多态写法
        computer.useDevice(keyboard); // 正确写法,自动发生了向上转型

        computer.powerOff();
    }
}

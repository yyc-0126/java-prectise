package day4;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager managger = new Manager("群主", 100);

        Member one = new Member("A", 0);
        Member two = new Member("B", 0);
        Member three = new Member("C", 0);

        managger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===========");

        ArrayList<Integer> redlist = managger.send(20, 3);

        one.recieve(redlist);
        two.recieve(redlist);
        three.recieve(redlist);

        managger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("===========");

    }
}

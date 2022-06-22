package day1227;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class jihe {
    public static void main(String[] args) {
        Collection<String> coll= new ArrayList<>();
//        System.out.println(coll);

        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        coll.add("eee");

        Iterator<String> it =  coll.iterator();

        while(it.hasNext()) {
            String e = it.next();
            System.out.println(e);
        }

//        System.out.println(coll);
////        coll.remove("abc");
////        System.out.println(coll);
//        boolean a = coll.contains("abc");
    }
}

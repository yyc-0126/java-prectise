package day3;

import java.util.ArrayList;

public class CreateStudent {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(a(array));
    }
    public static String a(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1){
                str += "word" + array[i] + "]";
            }
            else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}

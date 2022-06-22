package day2;

public class fangfa {
    public static void main(String[] args){
        int[] array = {4, 8, 10};
        double[] b = new double[10];
        String[] c = new String[5];
        int[] a = {1, 2, 3};
        int ans = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > ans) {
                ans = array[i];
            }

        }
        System.out.println("最大值：" + ans);
//        print_line(5);
//        System.out.println(z);
    }

    public static void print_line(int x) {
        for (int i = 1; i <= x; i++) {
            System.out.println("hi");
        }
    }
}

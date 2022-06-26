package practise1;

public class MyStringBuffer implements IStringBuffer{

    private int capacity = 16;
    private int length = 0;
    private char[] value;

    public MyStringBuffer() {
        value = new char[capacity];
    }

    public MyStringBuffer(String str) {
        if (null != str) {
            value = str.toCharArray();
        }

        length = value.length;

        if (capacity < length) {
            capacity = length * 2;
        }

    }

    @Override
    public void append(String str) {

    }

    @Override
    public void append(char c) {

    }

    @Override
    public void insert(int pos, char b) {

    }

    @Override
    public void insert(int pos, String b) {

    }

    @Override
    public void delete(int start) {

    }

    @Override
    public void delete(int start, int end) {

    }

    @Override
    public void reverse() {
        int l = 0, r = length - 1;
        char temp = ' ';

        while (l < r) {
            temp = value[l];
            value[l] = value[r];
            value[r] = temp;

            l++;
            r--;
        }

    }

    @Override
    public int length() {
        return 0;
    }
}

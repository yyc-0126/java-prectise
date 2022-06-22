package day20210106;

import java.util.Scanner;

public class MyException {
    static String[] usernames = {"aaa", "bbb", "ccc"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要输入的用户名：");
        String username = sc.next();
        try{
            checkUsername(username);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("后续代码");
        }


    }

    public static void checkUsername(String username) throws RegisterException{
        for (String name : usernames) {
            if (name.equals(username)){
                throw new RegisterException("该用户名已经被注册了");
            }
        }

        System.out.println("注册成功！");
    }
}

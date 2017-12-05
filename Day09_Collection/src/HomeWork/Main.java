package HomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请注册用户名");
        String name = input.nextLine();

        System.out.println("请注册账号");
        String userName = input.nextLine();
        System.out.println("请设置密码");
        String passWord = input.nextLine();
        System.out.println("请注册用户职业");
        String work = input.nextLine();


        System.out.println("请输入用户名");
        String username = input.nextLine();
        System.out.println("请输入用户密码");
        String password = input.nextLine();

        UserInter userinter = new Login().login(userName, password);


    }


}


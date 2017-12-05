package HomeWork;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);

        System.out.println("请输入userName");
        String userName = input.nextLine();
        System.out.println("请输入password");
        String password = input.nextLine();


        UserInter userinter = new Login().login(userName, password);


        if (userinter != null) {
            Person person = (Person) userinter;
            System.out.println(("当前用户名为" + person.getName() + "职业为" + person.getWork() + "姓名为" + person.getName() + "密码为" + person.getPassword()));

            long l = System.currentTimeMillis();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String time = df.format(l);
            System.out.println("当前时间为" + time);
            System.out.println("是否开始工作？1，是		2，否");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    userinter.onLine();
                    break;
                case 2:
                    userinter.offLine();
                    break;
                default:
                    System.out.println("日你奶奶,又瞎鸡儿输入");
            }
        }
        long c = System.currentTimeMillis();
        System.out.println("该程序运行用时" + (float) (c-a) / 1000 + "秒");
    }
}

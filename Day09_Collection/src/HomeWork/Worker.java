package HomeWork;

public class Worker extends Person implements UserInter {
    public Worker() {
        super();
    }

    public Worker(String name, String userName, String password, String work) {
        super(name, userName, password, work);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onLine() {
        System.out.println("工人开始干活了");
        strike();
    }

    @Override
    public void offLine() {
        System.out.println("工人觉得太累了想休息");
    }

    public void strike() {
        System.out.println("罢工！罢工！");
    }

}

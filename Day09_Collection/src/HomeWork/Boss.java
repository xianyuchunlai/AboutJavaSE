package HomeWork;

public class Boss extends Person implements UserInter {
    public Boss() {
        super();
    }

    public Boss(String name, String userName, String password, String work) {
        super(name, userName, password, work);
    }

    @Override
    public void onLine() {
        System.out.println("老板开始干活了");

        this.addMoney();
    }

    @Override
    public void offLine() {
        System.out.println("老板觉得太累了想休息");
    }

    public void addMoney() {
        System.out.println("涨工资？老板说你想多了");
    }
}

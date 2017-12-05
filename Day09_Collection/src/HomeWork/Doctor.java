package HomeWork;

public class Doctor extends Person implements UserInter {
    public Doctor() {
        super();
    }

    public Doctor(String name, String userName, String password, String work) {
        super(name, userName, password, work);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onLine() {
        System.out.println("医生开始干活了");
        operation();
    }

    @Override
    public void offLine() {
        System.out.println("医生觉得太累了想休息");
    }


    public void operation() {
        System.out.println("不好意思剪错了");
    }

}

package HomeWork;

public class Cooker extends Person implements UserInter{
    public Cooker() {
        super();
    }

    public Cooker(String name, String userName, String password, String work) {
        super(name, userName, password, work);
        // TODO Auto-generated constructor stub
    }

    public void onLine() {
        System.out.println("厨师开始干活了");
        topSpoon();
    }

    @Override
    public void offLine() {
        System.out.println("厨师觉得太累了想休息");
    }

    public void topSpoon(){
        System.out.println("颠勺其实挺累的");
    }

}

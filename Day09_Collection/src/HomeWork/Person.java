package HomeWork;

public class Person {
    private String name;
    private String userName;
    private String password;
    private String work;

    public Person() {
        super();
    }



    public Person(String name, String userName, String password, String work) {
        super();
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.work =work;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

}

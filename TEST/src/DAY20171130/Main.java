package DAY20171130;

public class Main {

    private static int index;

    public static void main(String[] args) {
	// write your code here


        // 2、在main中定义数组(容量为10个元素)，管理所有联系人。
        // 添加新联系人对象，如果姓名或电话号码为空，打印添加失败。
        Contact contact[] = new Contact[10];
        addContact(contact, new Contact("苯平", "13314219321"));
        addContact(contact, new Contact("小苯平", "13414219321"));


        // 3、获取某个分组下的所有联系人。
        contact[0].setGroup("青年");
        printContactsByGroup(contact, "青年");

        // 4、根据电话号码搜索联系人。
        printContactsByPhone(contact, "13414219321");

        // 5、获取所有女性联系人
        contact[0].setSex("女");
        printFemaleontacts(contact);

        // 6、展示通讯录中所有联系人
        printContact(contact);

    }

    // 2, 添加新联系人对象，如果姓名或电话号码为空，打印添加失败。
    public static void addContact(Contact contact[], Contact newContact) {
        if (null == newContact.getName() || null == newContact.getPhone()) {
            System.out.println("Insufficient parameters!");
            return;
        }
        contact[index++] = newContact;
    }

    // 3、获取某个分组下的所有联系人。
    public static void printContactsByGroup(Contact contact[], String group) {
        if (null == group) {
            System.out.println("Parameter error!");
            return;
        }
        for (int i = 0; i < index; i++) {
            if (group.equalsIgnoreCase(contact[i].getGroup())) {
                contact[i].info();
            }
        }

    }

    // 4、根据电话号码搜索联系人。
    public static void printContactsByPhone(Contact contact[], String phone) {
        if (null == phone) {
            System.out.println("Parameter error!");
            return;
        }
        for (int i = 0; i < index; i++) {
            if (phone.equalsIgnoreCase(contact[i].getPhone())) {
                contact[i].info();
            }
        }

    }

    // 5、获取所有女性联系人
    public static void printFemaleontacts(Contact contact[]) {

        for (int i = 0; i < index; i++) {
            if ("女".equalsIgnoreCase(contact[i].getGroup())) {
                contact[i].info();
            }
        }

    }
    // 6、展示通讯录中所有联系人
    public static void printContact(Contact contact[]) {
        for (int i = 0; i < index; i++) {
            contact[i].info();
        }
    }


}


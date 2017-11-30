package DAY20171130;

public class Main {

    private static int index;

    public static void main(String[] args) {
	// write your code here


        // 2����main�ж�������(����Ϊ10��Ԫ��)������������ϵ�ˡ�
        // �������ϵ�˶������������绰����Ϊ�գ���ӡ���ʧ�ܡ�
        Contact contact[] = new Contact[10];
        addContact(contact, new Contact("��ƽ", "13314219321"));
        addContact(contact, new Contact("С��ƽ", "13414219321"));


        // 3����ȡĳ�������µ�������ϵ�ˡ�
        contact[0].setGroup("����");
        printContactsByGroup(contact, "����");

        // 4�����ݵ绰����������ϵ�ˡ�
        printContactsByPhone(contact, "13414219321");

        // 5����ȡ����Ů����ϵ��
        contact[0].setSex("Ů");
        printFemaleontacts(contact);

        // 6��չʾͨѶ¼��������ϵ��
        printContact(contact);

    }

    // 2, �������ϵ�˶������������绰����Ϊ�գ���ӡ���ʧ�ܡ�
    public static void addContact(Contact contact[], Contact newContact) {
        if (null == newContact.getName() || null == newContact.getPhone()) {
            System.out.println("Insufficient parameters!");
            return;
        }
        contact[index++] = newContact;
    }

    // 3����ȡĳ�������µ�������ϵ�ˡ�
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

    // 4�����ݵ绰����������ϵ�ˡ�
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

    // 5����ȡ����Ů����ϵ��
    public static void printFemaleontacts(Contact contact[]) {

        for (int i = 0; i < index; i++) {
            if ("Ů".equalsIgnoreCase(contact[i].getGroup())) {
                contact[i].info();
            }
        }

    }
    // 6��չʾͨѶ¼��������ϵ��
    public static void printContact(Contact contact[]) {
        for (int i = 0; i < index; i++) {
            contact[i].info();
        }
    }


}


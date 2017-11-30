package DAY20171130;



/**
 * Created by travelround on 17/5/8.
 */
// 1��������ϵ����Contact��
// ���Ա������������Ա𡢵绰���롢סַ���������ơ�
// ���������췽�����������绰���룩����ʾ��ϵ����Ϣ
public class Contact {

    private String name;
    private String sex;
    private String phone;
    private String address;
    private String group;

    public Contact(String name, String sex, String phone, String adress, String group) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.address = address;
        this.group = group;
    }
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "Contact{}";
    }


    public void info() {
        System.out.print(name + " " + phone + " ");
        if (null != sex) {
            System.out.print(sex + " ");
        }
        if (null != address) {
            System.out.print(address + " ");
        }
        if (null != group) {
            System.out.print(group + " ");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}

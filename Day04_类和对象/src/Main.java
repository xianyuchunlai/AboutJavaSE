
public class Main {
	public static void main(String[] args) {
		//����Ǵ�������Ĺ���
		Car car = new Car();
		//��car�ĵ�ַ������c2
		Car c2 = car;
		c2.showInfo();
		
		//Car ������
		//car ���Ƕ����Ǹ���Car����ഴ������
//		car.showInfo();
		
		//���Գ�ʼ����˳��Ĭ�ϳ�ʼ������ʾ��ʼ�������������ʼ�������췽����ʼ��
		System.out.println(car == c2);
		
		Father f = new Father();
		Mother m = new Mother();
		Child c = new Child();
		
		f.showInfo();
		m.showInfo();
		c.showIofo();		
	}
}

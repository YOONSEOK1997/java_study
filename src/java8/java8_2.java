package java8;

class java8_2 {

	public static void main(String args[]) {
		System.out.println(1);
		System.out.println(2);
	try {
		System.out.println(3);
		System.out.println(0/0); //���ܹ߻�! 
		System.out.println(4); //������� �ʴ´�. (���ܰ� �߻��� ������ ������� ����x)
	} catch (ArithmeticException ae) { //������
		if (ae instanceof ArithmeticException)
		System.out.println("true��");
		System.out.println("ArithmeticException�̴�");
	} catch (Exception e) { //���������ƴϾ�? �׷��� �� ����ó�� (������ �ְ�����)
		System.out.println("exception");
	} //try -catch �� ��
		System.out.println(6);
		//main �޼����� ��
		

	}
}
package by.htp.homework.task01;

//��������� ������ ��� ����� a � b, ���� a=b, �� ������� �� ����� ����� ������ ����� ���!�,
//� ��������� ������ ������ ������ ����� � � ������� �� ����� 3 ������ :
// -�������� ��������� a+b+c 
// -��������  ��������� a^2 + b^2 
// -���� ������� ���������� �������

public class Task08 {

	public static void main(String[] args) {
		byte a = 30;
		byte b = 44;
		if (a == b) {
			System.out.println("����� ����� ���!");
		} else {
			byte c = 10;
			System.out.println(a + b + c);
			System.out.println(Math.pow(a, 2) + Math.pow(b, 2));
			System.out.println("��� ������ ���������� �������");

		}

	}

}

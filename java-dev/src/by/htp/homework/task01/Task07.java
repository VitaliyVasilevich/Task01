package by.htp.homework.task01;

//��������� ������ ��� ����� a � b, ���� � > b, �� ��������� ������ ������ ����� � � 
//������� ����� b+c. ���� �=b, �� ��������� �������� ����� �������. ���� �<b, 
//�� ��������� ������ ������ ����� �, ������� ����� a+b+c, ������� �� ����� ����� a+b+c � ����� ������ ���!�. 

public class Task07 {

	public static void main(String[] args) {
		double a = 15;
		double b = 18;
		double res;
		if (a > b) {
			int c = 5;
			res = b + c;
		} else if (a == b) {
			System.out.println("�����");
		} else {
			int c = 7;
			res = a + b + c;
			System.out.println("����� ���!");
		}

	}

}

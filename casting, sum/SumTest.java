/*
a:5(����ڰ� �Է�)
b:6(����ڰ� �Է�)
�� ���� ���� 11�Դϴ�.
*/

import java.util.Scanner;
class SumTest{//Ŭ�����̸��� �빮��
	public static void main(String [] args){
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		
		//System.out.format("�� ���� ���� %d�Դϴ�.\n",a+b);
		//print �Ǵ� println�� ����Ͽ� ����Ұ�
		System.out.print("�� ���� ���� "+(a+b)+"�Դϴ�");
		//���ڿ� + ���� ������ �ڿ��ִ� +�� ���ڿ� ���, ��ȣ�� �ְų� ���+ ���� ���
		}
}

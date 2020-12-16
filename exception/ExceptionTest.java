import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.*; //��ƿ ��� ��Ű�� 

class ExceptionTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("�� ���� a, b �� �Է¹޾� a/b(��)�� ����մϴ�. ");
		try{
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		/*
		while(true){
			System.out.println("b: ");
			b = s.nextInt();
			if(b!=0) break;
			System.out.println("b�� 0�̴� ���� �Է����ּ���.");
		}*/
		
		System.out.println("a/b: "+a/b);
		}catch(ArithmeticException ae){//lang ��Ű���� ���� import �ʿ� ����
			ae.printStackTrace();//�����ڻ��(������), ���ܹ����� ����
			System.out.println("0���δ� ���� �� �����.");
		}catch(InputMismatchException ime){//util ��Ű���� �־� import �ʿ� or java.util.InputMismatchException �Է�
			System.out.println("�ƶ��Ƽ��ڷ� �Է��ϼ���.");
		}
		/*catch(Exception e){
			System.out.println("���ܰ� �߻��߽��ϴ�."); //Exception = �������� ó�� �Ұ�
		}*/
		finally {//���ܰ� �߻����� �ʾƵ� ������ �����
			System.out.println("�� ������ �ݵ�� �����");
		}
		System.out.println("���α׷� ����.");
		
	}
}
import java.util.*;

class ExceptionTest2{
	public static void main(String [] args){
		//���ε� ���ܴ����� ������ ����: ����ó�� ���������� main throws Excetion
		//after10();
		
		try{
			after10();
		}catch(InputMismatchException ime){
			System.out.println("���̸� �ƶ��� ���ڷ��Է����� �ʾ� �߻��� ���� ���ο��� �ذ�");
		}catch(NegativeAgeException nae){
			System.out.println(nae.getMessage());
			//NegativeAgeException ���� ��� -
			nae.printStackTrace();
			//System.out.println("���̴� ������ �� �����ϴ�.");
		}catch(TooOldException to){
			System.out.println(to.getMessage());
			to.printStackTrace();
		}
		System.out.println("�̰� ��µǸ� ������ ���� �ƴ�");
	}
	static void after10() throws InputMismatchException,NegativeAgeException,TooOldException{
		//���� Ŭ���� static, throws �ذ��������� �ϴ� ����
		Scanner s = new Scanner(System.in);
		int age;
		/*try{
		System.out.print("����: ");
		age = s.nextInt();
		System.out.format("10�� �� ���̴� %d�� �Դϴ�.\n", age+10);
		}catch(java.util.InputMismatchException ime){
			System.out.println("���� �߻�");
		}*/
		
		System.out.print("����: ");
		age = s.nextInt();
		if(age<0) throw new NegativeAgeException();
		if(age>200) throw new TooOldException();
		//thorw�� ���ܰ� �߻��ߴٴ� �� JVM���� �˷��ִ� Ű����
		//���� ����ڰ� �Է��� ���̰� ������� NegativeAgeException�� �߻��ϵ��� ����� throw��
		System.out.format("10�� �� ���̴� %d�� �Դϴ�.\n", age+10);
		
	}
}

//����ڰ� ���ܸ� �ۼ�: ����� ���� ����
class NegativeAgeException extends Exception{//�ݵ�� ���ܻ��
	NegativeAgeException(){
		super("[�������̿���]���̸� ������ ������ ����"); // NegativeAgeException ����
	}
}
class TooOldException extends Exception{
	TooOldException(){
		super("���̰� 200 �̻��� ��� �߻��� ����");
	}
}
import java.util.Scanner;

class Member{
	String name;
	int age;
	static int number;
	
	Member(){
		this.name = "�̸�";
		this.age = 20;
		System.out.println("����Ʈ ������ ���� ��ȣȸ ��� ����");
		number++;
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("�̸��� ���̰� �����ϴ� ��ȣȸ ��� ����");
		number++;
	}
}

class MemberTest{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member("����", 30);
		
		System.out.printf("�� ��ȣȸ�� ��� ���� %d ���Դϴ�.",Member.number);
	}
}
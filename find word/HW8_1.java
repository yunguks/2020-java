import java.util.Scanner;

class HW8_1{
	public static void main(String [] args){
		StringManipulate ch = new StringManipulate();
		String s1,s2;
		Scanner s = new Scanner(System.in);
		System.out.print("���� 1:");
		s1 = s.nextLine();
		System.out.print("���� 2:");
		s2 = s.nextLine();
		
		ch.concat(s1,s2);
		ch.toUpper(s1);
		ch.equals(s1,s2);
	}
}

class StringManipulate{

	void concat(String s1,String s2){
		System.out.printf("���� 1�� ���� 2 ���� ���: %s%s\n",s1,s2);
	}
	
	void toUpper(String s){
		System.out.printf("���� 1 �빮�� ��ȯ ���: %s\n",s.toUpperCase());
	}
	
	void equals(String s1,String s2){
		if(s1.equals(s2)==false)
			System.out.println("���� 1�� ���� 2�� ��ġ ����: false");
		else System.out.println("���� 1�� ���� 2�� ��ġ ����: true");
	}
}
	
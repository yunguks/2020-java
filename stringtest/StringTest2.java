import java.util.Scanner;

class StringTest2{
	public static void main (String [] args){
		Scanner s = new Scanner(System.in);
		
		String s1, s2;
		
		System.out.print("���� 1:");
		s1 = s.nextLine();
		System.out.print("���� 2:");
		s2 = s.nextLine();
		
		concat(s1,s2);
		toUpper(s1);
		equals(s1,s2);
	}
	
	static void concat(String s1, String s2){
		System.out.printf("���� 1�� ���� 2 ���� ���: %s\n",s1.concat(s2));
	}
	
	static void toUpper(String s){
		System.out.printf("���� 1 �빮�� ��ȯ ��� : %s\n",s.toUpperCase());
	}
	
	static void equals(String s1, String s2){
		System.out.print("���� 1�� ���� 2�� ��ġ����: "+s1.equals(s2));
	}
}
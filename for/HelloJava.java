import java.util.Scanner;

class HelloJava{
	public static void main(String [] args){
		String st;
		Scanner s = new Scanner(System.in);
		int len, a=0;
		char c,sw;
		
		System.out.print("���ڿ�: ");
		st = s.nextLine();
		System.out.print("����: ");
		sw = s.nextLine().charAt(0);
		
		len = st.length();
		for(int i=0;i<len;i++)
		{
			c = st.charAt(i);
			if(c==sw) {
				System.out.printf("%d ��° ",i+1);
				a++;
			}
		}
		System.out.printf("\n���ڿ� \"%s\"���� ���� '%s'�� %d�� �˻��Ǿ����ϴ�.",st,sw,a);
	}
}
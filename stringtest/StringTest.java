import java.util.Scanner;

class StringTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String st;
		int len, x, a, b, tmp;
		
		/*System.out.print("���ڿ�: ");
		st = s.nextLine();
		
		len = st.length();
		
		while(true){
			System.out.print("x: ");
			x = s.nextInt();
			if(x>=1 && x<=len) break;
			System.out.println("[�Է¿���]���ڿ��� ���� ������ ����� �Է����ּ���.");
		}
		System.out.printf("%d��° ���ڴ� '%c'�Դϴ�\n", x, st.charAt(x-1));
		*/
		System.out.print("���ڿ�: ");
		st = s.nextLine();
		
		len = st.length();
		
		while(true){
			System.out.print("a: ");
			a = s.nextInt();
			if(a>=1 && a<=len) break; 
			System.out.println("[�Է¿���]a�� ���ڿ��� ���� ������ ����� �Է����ּ���.");
		}
		while(true){
			System.out.print("a: ");
			b = s.nextInt();
			if(b>=1 && b<=len) break;
			System.out.println("[�Է¿���]b�� ���ڿ��� ���� ������ ����� �Է����ּ���.");
		}
		if(a>b){
			//a b�� ����� �� ��ȯ
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.printf("���ڿ� \"%s\"���� %d���� %d���� ������ ���ڿ��� \"%s\"�Դϴ�", st,a,b,st.substring(a-1,b));
		
	}
}
import java.util.Scanner;
class Week3{
	public static void main (String [] args){
		double a;
		int b, c, d, e, f;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�Ǽ��� �Է� �Ͻÿ� : ");
		a = s.nextDouble();
		
		b = (int)a;
		c = (b >>> 31) == 1 ? -b : b;
		
		d = (c << 3);
		e = (c >> 3);
		f = ((e << 3) ^ c);
		
	System.out.printf("���� �κ��� ���밪 : %d\n8�� ���Ѱ� : %d\n8�� ���� �� : %d\n������ : %d",c,d,e,f);
	}
}

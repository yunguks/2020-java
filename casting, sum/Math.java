import java.util.Scanner;
class Math{
	public static void main (String [] args){
		int plus, multi, minus, a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� a�� �Է��Ͻÿ� : ");
		a = s.nextInt();
		System.out.print("���� b�� �Է��Ͻÿ� : ");
		b = s.nextInt();
		
		plus = a + b;
		multi = a * b;
		minus = a - b;
		
		System.out.format("a + b = %+15d\na * b = %#-15o\na - b = %#15x",plus,multi,minus);
	}
}
		
	
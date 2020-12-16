import java.util.Scanner;
class Math{
	public static void main (String [] args){
		int plus, multi, minus, a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수 a를 입력하시오 : ");
		a = s.nextInt();
		System.out.print("정수 b를 입력하시오 : ");
		b = s.nextInt();
		
		plus = a + b;
		multi = a * b;
		minus = a - b;
		
		System.out.format("a + b = %+15d\na * b = %#-15o\na - b = %#15x",plus,multi,minus);
	}
}
		
	
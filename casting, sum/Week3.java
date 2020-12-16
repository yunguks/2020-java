import java.util.Scanner;
class Week3{
	public static void main (String [] args){
		double a;
		int b, c, d, e, f;
		Scanner s = new Scanner(System.in);
		
		System.out.print("실수를 입력 하시오 : ");
		a = s.nextDouble();
		
		b = (int)a;
		c = (b >>> 31) == 1 ? -b : b;
		
		d = (c << 3);
		e = (c >> 3);
		f = ((e << 3) ^ c);
		
	System.out.printf("정수 부분의 절대값 : %d\n8을 곱한값 : %d\n8을 나눈 몫 : %d\n나머지 : %d",c,d,e,f);
	}
}

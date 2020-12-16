/*
a:5(사용자가 입력)
b:6(사용자가 입력)
두 수의 합은 11입니다.
*/

import java.util.Scanner;
class SumTest{//클래스이름은 대문자
	public static void main(String [] args){
		int a, b;
		Scanner s = new Scanner(System.in);
		
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		
		//System.out.format("두 수의 합은 %d입니다.\n",a+b);
		//print 또는 println을 사용하여 출력할것
		System.out.print("두 수의 합은 "+(a+b)+"입니다");
		//문자열 + 먼저 나오면 뒤에있는 +도 문자열 취급, 괄호를 넣거나 산술+ 먼저 사용
		}
}

import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.*; //유틸 모든 패키지 

class ExceptionTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("두 정수 a, b 를 입력받아 a/b(몫)을 계산합니다. ");
		try{
		System.out.print("a: ");
		a = s.nextInt();
		System.out.print("b: ");
		b = s.nextInt();
		/*
		while(true){
			System.out.println("b: ");
			b = s.nextInt();
			if(b!=0) break;
			System.out.println("b는 0이닌 수로 입력해주세요.");
		}*/
		
		System.out.println("a/b: "+a/b);
		}catch(ArithmeticException ae){//lang 패키지는 따로 import 필요 없음
			ae.printStackTrace();//개발자사용(배포전), 예외문장이 나옴
			System.out.println("0으로는 나눌 수 없어요.");
		}catch(InputMismatchException ime){//util 패키지에 있어 import 필요 or java.util.InputMismatchException 입력
			System.out.println("아라비아숫자로 입력하세요.");
		}
		/*catch(Exception e){
			System.out.println("예외가 발생했습니다."); //Exception = 디테일한 처리 불가
		}*/
		finally {//예외가 발생하지 않아도 무조껀 실행됨
			System.out.println("이 문장은 반드시 실행됨");
		}
		System.out.println("프로그램 종료.");
		
	}
}
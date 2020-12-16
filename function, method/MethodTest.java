class MethodTest{
	public static void main(String [] args){
		//커맨드라인에 두개가 입력되지 않은 경우(사용법을 알려주고 종료하기ㅏ)
		if(args.length<2) {
			System.out.println("[Usage]java MethodTest 실수1 실수2");
			System.exit(1);//return;
		}
		
		
		System.out.println(Double.parseDouble (args[0]) + Double.parseDouble (args[1]));
		//문자열을 숫자로 변환하기
		//Wrapper 클래스: Integer, Double, Byte,
		//기초 자료형을 객체로 포장한 클래스
		//Integer.parseInt("3")
		//Double.parseDouble("3.15")
		
		System.out.println(sum(2,3));
		System.out.println(division(4,5));
		System.out.println(absolute(-9.3));
		big(6.4, 0.2);
		
	}
	//두정수 입력값의 합을 계산하는 메소드
	static int sum(int a, int b){
		return a+b;
	}
	/*
	- 정수 2개를 입력 받아 나눈 결과(실수)를 반환하는 division() 메소드
	- 실수 1개를 입력 받아 그 절대값을 반환하는 absolute() 메소드
	- 실수 2개를 입력 받아 두 정수 중에서 큰 수를 출력하는 big() 메소드
	*/
	static double division(int a, int b){
		return (double)a/b;
	}
	
	static double absolute(double d){
		double rslt = d>0? d: -d;
		return rslt;
		
		/*if(d>0) return d;
		else return -d;
		*/
	}
	
	static void big(double a, double b){
		System.out.printf("%.2f와 %.2f 중 큰 수는 %.2f입니다.\n", a, b, a>b?a:b);
		return;
	}
	
	
	
}

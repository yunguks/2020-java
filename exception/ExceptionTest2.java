import java.util.*;

class ExceptionTest2{
	public static void main(String [] args){
		//메인도 예외던지면 비정상 종료: 예외처리 하지않은것 main throws Excetion
		//after10();
		
		try{
			after10();
		}catch(InputMismatchException ime){
			System.out.println("나이를 아라비아 숫자로입력하지 않아 발생한 문제 메인에서 해결");
		}catch(NegativeAgeException nae){
			System.out.println(nae.getMessage());
			//NegativeAgeException 설명 출력 -
			nae.printStackTrace();
			//System.out.println("나이는 음수일 수 없습니다.");
		}catch(TooOldException to){
			System.out.println(to.getMessage());
			to.printStackTrace();
		}
		System.out.println("이게 출력되면 비정상 종료 아님");
	}
	static void after10() throws InputMismatchException,NegativeAgeException,TooOldException{
		//같은 클래스 static, throws 해결해줬으면 하는 예외
		Scanner s = new Scanner(System.in);
		int age;
		/*try{
		System.out.print("나이: ");
		age = s.nextInt();
		System.out.format("10년 후 나이는 %d세 입니다.\n", age+10);
		}catch(java.util.InputMismatchException ime){
			System.out.println("예외 발생");
		}*/
		
		System.out.print("나이: ");
		age = s.nextInt();
		if(age<0) throw new NegativeAgeException();
		if(age>200) throw new TooOldException();
		//thorw는 예외가 발생했다는 걸 JVM에게 알려주는 키워드
		//만약 사용자가 입력한 나이가 음수라면 NegativeAgeException을 발생하도록 만들기 throw로
		System.out.format("10년 후 나이는 %d세 입니다.\n", age+10);
		
	}
}

//사용자가 예외를 작성: 사용자 정의 예외
class NegativeAgeException extends Exception{//반드시 예외상속
	NegativeAgeException(){
		super("[음수나이예외]나이를 음수로 설정한 예외"); // NegativeAgeException 설명
	}
}
class TooOldException extends Exception{
	TooOldException(){
		super("나이가 200 이상인 경우 발생한 예외");
	}
}
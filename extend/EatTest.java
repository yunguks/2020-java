/*나 클래스
- 먹는다 : eat(): 매개변수로 받은 음식을 먹는다는 문장을 출력

햄버거 클래스
피자 클래스
빙수 클래스
아이스크림 클래스

테스트 클래스
- 나 , 음식들 생성후 내가 생성된 음식을 먹는 것을 시뮬레이션 할 것

다형성의 장점
1. 중복정의가 필요 없다. 메소드의 매개변수를 상위클래스의 자료형으로 두면 하위 클래스의 객체를 모두 처리 가능 
*/
class Food{}
class I{
	void eat(Object o) throws NotFoodException{// 업캐스팅 상위의 오브젝트로 받음
		//만약 음식이라면
		if(o instanceof Food)
		System.out.println(o.getClass().getName()+"를(을) 먹습니다.");
		//아니라면 장난치지 마세요
		else {
			System.out.println(o.getClass().getName()+"는 음식이 아니라 먹지 않겠습니다.");
			throw new NotFoodException();
		}
	}
	
	/*void eat(Burger b){
		System.out.println("햄버거를 먹습니다.");
	}
	void eat(Pizza p){
		System.out.println("피자를 먹습니다.");
	}
	void eat(Bingsu s){
		System.out.println("빙수를 먹습니다.");
	}
	void eat(IceCream c){
		System.out.println("아이스크림를 먹습니다.");
	}*/
}
class NotFoodException extends Exception{
	NotFoodException(){
		super("음식아닌 예외");
	}
}
/*eat()메소드는 인자가 음식이라면 "**을 먹습니다" 메시지를 출력하고, 인자가 음식이 아니라면 
NotFoodException을 발생시키고, 이 예외를 직접 처리하지 않고 자신을 호출한 곳으로 던진다.*/
class Stone{}
class Burger extends Food{}
class Pizza extends Food{}
class Bingsu extends Food{}
class IceCream extends Food{}

class EatTest{
	public static void main(String [] args){
		try{ // 예외나올때 멈추는 try , 개별적으로 해준다면 stone이 나와도 끝까지 간다.
			I i = new I();
			Burger b = new Burger();
			i.eat(b);
			Pizza p = new Pizza();
			i.eat(p);
			i.eat(new IceCream());
			i.eat(new Bingsu());
			i.eat(new Stone());
		}catch(NotFoodException nfe){
			System.out.println("나에게 음식 아닌 것을 주지마세요.");
		}
		/*
		Object b = new Burger();
		Object p = new Pizza();
		*/
	}
}

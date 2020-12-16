/*
지휘자 클래스 
 - 지휘할 수 있음 : conduct() : 매개변수로 받은 연주자들에게 지휘를 한다.
피아니스트 클래스
 - play() : "피아노를 연주합니다" 문장을 출력
 첼리스트 클래스
 - play() : "첼로를 연주합니다" 문장을 출력
 바이올리니스트 클래스
 - play() : "바이올린을 연주합니다" 문장을 출력
 
 테스트 클래스
  - 연주자들(피아니스트, 챌리스트, 바이올리니스트) 여러명 생성
  - 지휘자 생성 후 위에서 생성한 연주자들에게 지휘하는 것을 시뮬레이션
  
 다형성의 장점
  2. 자식클래스의 객체들을 부모클래스 자료형이 배열에 담을 수 있다.
     어떤 객체도 담을 수 있는 배열의 자료형은 Object 이다
 */
class PlayTest{
	public static void main(String [] args){
		/*연주자 p1 = new 피아니스트();
		연주자 p2 = new 피아니스트();
		연주자 p3 = new 피아니스트();
		연주자 p4 = new 피아니스트();
		연주자 c1 = new 첼리스트();
		연주자 c2 = new 첼리스트();
		연주자 c2 = new 첼리스트();
		연주자 v1 = new 바이올리니스트();
		연주자 v2 = new 바이올리니스트();
		연주자 v3 = new 바이올리니스트();
		연주자 v4 = new 바이올리니스트();*/
		//배열은 자료형이 같은 자료들의 모임
		연주자 [] players = {new 바이올리니스트(), new 피아니스트(), new 피아니스트(), new 피아니스트(), new 바이올리니스트(), new 챌리스트(), new 챌리스트(),
		new 바이올리니스트(), new 피아니스트(), new 바이올리니스트(), new 챌리스트()};	
		지휘자 c = new 지휘자();
		//conduct 연주해라를 모두에게 할 수 잇음 
		c.conduct(players);
	}
}
class 연주자{
	void play(){
		System.out.println("연주합니다.");
	}
}
class 지휘자{
	void conduct(연주자 [] players){
		for(int i = 0; i<players.length; i ++){
			players[i].play();
		}
	}
}
class 피아니스트 extends 연주자{
	void play(){
		System.out.print("피아노를 ");
		super.play();
	}
}
class 챌리스트 extends 연주자{
	void play(){
		System.out.print("챌로를 ");
		super.play();
	}
}
class 바이올리니스트 extends 연주자{
	void play(){
		System.out.print("바이올린을 ");
		super.play();
	}
}
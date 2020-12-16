import java.util.Scanner;

class LampTest{
	public static void main (String [] args){
		//지역변수: 메소드 내부에 조재하는 변수,  초기화하지 않고 사용 불가능
		Lamp myLamp = new Lamp(); // 램프 생성
		System.out.println("전원 상태: "+(myLamp.power==true?"켜짐":"꺼짐"));//램프 전원 확인
		myLamp.on();//램프 킴
		myLamp.off();//램프 끔
		myLamp.on();
		myLamp.up();//램프 밝게
		myLamp.up();
		myLamp.up();
		myLamp.down();//램프 어둡게
		
	}
}

class Lamp{
	//필드(멤버 변수): 클래스내부에 존재, 초기화하지 않는다면 자동적으로 자료형에 맞는 0으로 초기화
	boolean power; // 0으로 초기화, false로 초기화
	int brightness; // 0으로 초기화
	
	void on(){
		power = true;
		System.out.println("램프가 켜졌습니다.");
	}
	
	void off(){
		power = false;
		System.out.println("램프가 꺼졌습니다.");
	}
	
	void up(){
		if(power==true){
			if(brightness<10) {
				brightness++;
				System.out.printf("한 단계 밝아졌습니다. 현재 밝기는 %d입니다.\n",brightness);
			}
			else System.out.println("최고 밝기 입니다.");
		}
		else System.out.println("전원부터 켜 주세요.");
	}
	
	void down(){
		if(power==true){
			if(brightness>0) {
				brightness--;
				System.out.printf("한 단계 어두워졌습니다. 현재 밝기는 %d입니다.\n",brightness);
			}
			else System.out.println("최저 밝기 입니다.");
		}
		else System.out.println("전원부터 켜 주세요.");
	}
}
		
		
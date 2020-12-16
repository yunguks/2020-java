import java.util.Scanner;

class RadioTest{
	public static void main (String [] args){
		Radio myRadio = new Radio();
		System.out.println("전원 상태: "+(myRadio.power==true?"켜짐":"꺼짐"));
		myRadio.on();
		myRadio.off();
		myRadio.on();
		myRadio.soundup();
		myRadio.soundup();
		myRadio.soundup();
		myRadio.soundup();
		myRadio.sounddown();
		myRadio.chanelup();
		myRadio.chanelup();
		myRadio.chanelup();
		myRadio.chaneldown();
		
	}
}

class Radio{
	boolean power;
	int sound, hz=100;
	
	void on(){
		power = true;
		System.out.println("라디오가 켜졌습니다.");
	}
	
	void off(){
		power = false;
		System.out.println("라디오가 꺼졌습니다.");
	}
	
	void soundup(){
		if(power==true){
			if(sound<10) {
				sound++;
				System.out.printf("소리가 커졌습니다. 현재 소리는 %d입니다.\n",sound);
			}
			else System.out.println("최고 소리 입니다.");
		}
		else System.out.println("전원부터 켜 주세요.");
	}
	
	void sounddown(){
		if(power==true){
			if(sound>0) {
				sound--;
				System.out.printf("소리가 작아졌습니다. 현재 소리는 %d입니다.\n",sound);
			}
			else System.out.println("최저 소리 입니다.");
		}
		else System.out.println("전원부터 켜 주세요.");
	}
	
	void chanelup(){
		if(power==true){
			if(hz<150) {
				hz++;
				System.out.printf("주파수를 올렸습니다. 현재 주파수는 %d입니다.\n",hz);
			}
			else System.out.println("최고 주파수 입니다.");
		}
		else System.out.println("전원부터 켜 주세요.");
	}
	
	void chaneldown(){
		if(power==true){
			if(hz>50) {
				hz--;
				System.out.printf("주파수를 내렸습니다. 현재 주파수는 %d입니다.\n",hz);
			}
			else System.out.println("최저 주파수 입니다.");
		}
		else System.out.println("전원부터 켜 주세요.");
	}
}
	
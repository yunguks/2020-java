import java.util.Scanner;

class RadioTest{
	public static void main (String [] args){
		Radio myRadio = new Radio();
		System.out.println("���� ����: "+(myRadio.power==true?"����":"����"));
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
		System.out.println("������ �������ϴ�.");
	}
	
	void off(){
		power = false;
		System.out.println("������ �������ϴ�.");
	}
	
	void soundup(){
		if(power==true){
			if(sound<10) {
				sound++;
				System.out.printf("�Ҹ��� Ŀ�����ϴ�. ���� �Ҹ��� %d�Դϴ�.\n",sound);
			}
			else System.out.println("�ְ� �Ҹ� �Դϴ�.");
		}
		else System.out.println("�������� �� �ּ���.");
	}
	
	void sounddown(){
		if(power==true){
			if(sound>0) {
				sound--;
				System.out.printf("�Ҹ��� �۾������ϴ�. ���� �Ҹ��� %d�Դϴ�.\n",sound);
			}
			else System.out.println("���� �Ҹ� �Դϴ�.");
		}
		else System.out.println("�������� �� �ּ���.");
	}
	
	void chanelup(){
		if(power==true){
			if(hz<150) {
				hz++;
				System.out.printf("���ļ��� �÷Ƚ��ϴ�. ���� ���ļ��� %d�Դϴ�.\n",hz);
			}
			else System.out.println("�ְ� ���ļ� �Դϴ�.");
		}
		else System.out.println("�������� �� �ּ���.");
	}
	
	void chaneldown(){
		if(power==true){
			if(hz>50) {
				hz--;
				System.out.printf("���ļ��� ���Ƚ��ϴ�. ���� ���ļ��� %d�Դϴ�.\n",hz);
			}
			else System.out.println("���� ���ļ� �Դϴ�.");
		}
		else System.out.println("�������� �� �ּ���.");
	}
}
	
import java.util.Scanner;

class LampTest{
	public static void main (String [] args){
		//��������: �޼ҵ� ���ο� �����ϴ� ����,  �ʱ�ȭ���� �ʰ� ��� �Ұ���
		Lamp myLamp = new Lamp(); // ���� ����
		System.out.println("���� ����: "+(myLamp.power==true?"����":"����"));//���� ���� Ȯ��
		myLamp.on();//���� Ŵ
		myLamp.off();//���� ��
		myLamp.on();
		myLamp.up();//���� ���
		myLamp.up();
		myLamp.up();
		myLamp.down();//���� ��Ӱ�
		
	}
}

class Lamp{
	//�ʵ�(��� ����): Ŭ�������ο� ����, �ʱ�ȭ���� �ʴ´ٸ� �ڵ������� �ڷ����� �´� 0���� �ʱ�ȭ
	boolean power; // 0���� �ʱ�ȭ, false�� �ʱ�ȭ
	int brightness; // 0���� �ʱ�ȭ
	
	void on(){
		power = true;
		System.out.println("������ �������ϴ�.");
	}
	
	void off(){
		power = false;
		System.out.println("������ �������ϴ�.");
	}
	
	void up(){
		if(power==true){
			if(brightness<10) {
				brightness++;
				System.out.printf("�� �ܰ� ��������ϴ�. ���� ���� %d�Դϴ�.\n",brightness);
			}
			else System.out.println("�ְ� ��� �Դϴ�.");
		}
		else System.out.println("�������� �� �ּ���.");
	}
	
	void down(){
		if(power==true){
			if(brightness>0) {
				brightness--;
				System.out.printf("�� �ܰ� ��ο������ϴ�. ���� ���� %d�Դϴ�.\n",brightness);
			}
			else System.out.println("���� ��� �Դϴ�.");
		}
		else System.out.println("�������� �� �ּ���.");
	}
}
		
		
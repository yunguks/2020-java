import java.util.Scanner;

class Driver{
	public static void main (String [] args){
		Car myCar = new Car();
		myCar.getMileage();
		myCar.goStraight(25);
		myCar.setMileage(25);
		myCar.turnLeft();
		myCar.goStraight(30);
		myCar.setMileage(30);
		myCar.turnRight();
		myCar.goStraight(20);
		myCar.setMileage(20);
		
		System.out.printf("�� ����Ÿ��� %dm�Դϴ�.",myCar.getMileage());
		
	}
}

class Car{
	private int mileage;
	
	void goStraight(int a){
		System.out.printf("%dm �����߽��ϴ�.\n",a);
	}
	
	void turnLeft(){
		System.out.printf("��ȸ�� �� ");
	}
	
	void turnRight(){
		System.out.printf("��ȸ�� �� ");
	}
	
	int getMileage(){
		return mileage;
	}
	
	int setMileage(int mileage){
		this.mileage += mileage;
		return mileage;
	}
}
		
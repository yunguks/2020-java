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
		
		System.out.printf("총 주행거리는 %dm입니다.",myCar.getMileage());
		
	}
}

class Car{
	private int mileage;
	
	void goStraight(int a){
		System.out.printf("%dm 직진했습니다.\n",a);
	}
	
	void turnLeft(){
		System.out.printf("좌회전 후 ");
	}
	
	void turnRight(){
		System.out.printf("우회전 후 ");
	}
	
	int getMileage(){
		return mileage;
	}
	
	int setMileage(int mileage){
		this.mileage += mileage;
		return mileage;
	}
}
		
class Ride {
	protected int wheel;
	protected int distance;
	protected int take;
	
	
}
class Car extends Ride{
	protected String company;
	protected int take1;
	Car(){
		wheel = 4;
		company = "현대";
		distance = 0;
	}
	Car(int wheel, String company){
		this.wheel = wheel;
		this.company = company;
	}
	void run(int wheel, int distance){
		this.wheel = wheel;
		this.distance = distance;
		if (wheel == 4) {
			take1 += distance;
			System.out.printf("나는 Car이고, %dm만큼 직진합니다. 이제까지 총 %d만큼 직진했습니다.\n",distance,take1);
		}
	}
}

class Bike extends Ride{
	protected int take2;
	Bike(){
		wheel = 2;
		distance = 0;
	}
	Bike(int wheel){
		this.wheel = wheel;
	}
	void run(int wheel, int distance){
		this.wheel = wheel;
		this.distance = distance;
		if (wheel == 2) {
			take2 += distance;
			System.out.printf("나는 Bike이고, %dm만큼 직진합니다. 이제까지 총 %d만큼 직진했습니다.\n",distance,take2);
		}
	}
}
class Stone{}
class Garage{}
class Carp{
	protected int soo; // 주차한 차 수
	void Park(Object [] o){
		for(int i=0; i<o.length; i++){
			if(o[i] instanceof Ride){
				soo ++;
				System.out.printf("%s를 차고에 주차하였습니다.(총 %d대 주차됨)\n",o[i].getClass().getName(),soo);
			}
			else System.out.printf("%s는 주차 불가능합니다.(총 %d대 주차됨)\n",o[i].getClass().getName(),soo);
		}
	}
	
	void Park(Object o){
			if(o instanceof Ride){
				soo ++;
				System.out.printf("%s를 차고에 주차하였습니다.(총 %d대 주차됨)\n",o.getClass().getName(),soo);
			}
			else System.out.printf("%s는 주차 불가능합니다.(총 %d대 주차됨)\n",o.getClass().getName(),soo);
	}
}

class ParkTest{
	public static void main(String [] args){
		Object [] r = {new Car(), new Bike(), new Car(), new Car(), new Bike(), new Bike(), new Stone(), new Garage()};
		Car c1 = new Car();
		Bike b1 = new Bike();
		c1.run(4,30);
		b1.run(2,50);
		c1.run(4,40);
		Carp my = new Carp();
		my.Park(r);
		Stone s = new Stone();
		my.Park(s);
		my.Park(c1);
		}
}
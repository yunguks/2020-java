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
		company = "����";
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
			System.out.printf("���� Car�̰�, %dm��ŭ �����մϴ�. �������� �� %d��ŭ �����߽��ϴ�.\n",distance,take1);
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
			System.out.printf("���� Bike�̰�, %dm��ŭ �����մϴ�. �������� �� %d��ŭ �����߽��ϴ�.\n",distance,take2);
		}
	}
}
class Stone{}
class Garage{}
class Carp{
	protected int soo; // ������ �� ��
	void Park(Object [] o){
		for(int i=0; i<o.length; i++){
			if(o[i] instanceof Ride){
				soo ++;
				System.out.printf("%s�� ���� �����Ͽ����ϴ�.(�� %d�� ������)\n",o[i].getClass().getName(),soo);
			}
			else System.out.printf("%s�� ���� �Ұ����մϴ�.(�� %d�� ������)\n",o[i].getClass().getName(),soo);
		}
	}
	
	void Park(Object o){
			if(o instanceof Ride){
				soo ++;
				System.out.printf("%s�� ���� �����Ͽ����ϴ�.(�� %d�� ������)\n",o.getClass().getName(),soo);
			}
			else System.out.printf("%s�� ���� �Ұ����մϴ�.(�� %d�� ������)\n",o.getClass().getName(),soo);
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
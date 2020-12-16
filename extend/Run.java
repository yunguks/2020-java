class Cat extends Animal{
	void move(){
		System.out.println("���� Cat�̰�, �޸��ϴ�.");
	}
}

class Dolphin extends Animal{
	void move(){
		System.out.println("���� Dolphin�̰�, �����մϴ�.");
	}
}

class Dove extends Animal{
	void move(){
		System.out.println("���� Dove�̰�, ���ƴٴմϴ�.");
	}
}

class Animal{
	void move(){
		//System.out.printf("���� %s�̰�, ",getClass().getName());
	}
}

class Run{
	public static void main(String [] args){
		Animal [] animals={new Cat(), new Dolphin(), new Dove()}; 
		for(Animal a: animals) a.move();
	} 
}
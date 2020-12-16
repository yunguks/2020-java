class Cat extends Animal{
	void move(){
		System.out.println("나는 Cat이고, 달립니다.");
	}
}

class Dolphin extends Animal{
	void move(){
		System.out.println("나는 Dolphin이고, 수영합니다.");
	}
}

class Dove extends Animal{
	void move(){
		System.out.println("나는 Dove이고, 날아다닙니다.");
	}
}

class Animal{
	void move(){
		//System.out.printf("나는 %s이고, ",getClass().getName());
	}
}

class Run{
	public static void main(String [] args){
		Animal [] animals={new Cat(), new Dolphin(), new Dove()}; 
		for(Animal a: animals) a.move();
	} 
}
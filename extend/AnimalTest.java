/* 편의상 모든 필드 접근 지시자는 protected로 둘것
Animal 
 - age
 - speak() : 음 .. 어떻게 말해야 할까?
 - toString() : Animal입니다.
 
Dog
 - name
 - speak() : 난 강아지. 멍멍!
 - eat() : 맛있어요~ 멍멍!
 - toString() : Dog입니다.
 
Cat
 - name
 - speak() : 난 고양이. 야옹!
 - eat() : 맛있어요~ 야옹!
 - toString() : Cat입니다.
 
JindoDOg
 - Color
 - hunt() : 사냥하러가볼까요~
 - toString() : JindoDog입니다.
 - equals(Object o): 나이, 이름, 색상이 같다면 같은 진돗개로 간주하도록 재정의
 
추가) 각 클래스에서 디폴트 생성자와 가지고 있는 모든 필드를 초기화하는 생성자를 각각 작성하시오.

AnimalTest 동물 생성후 실행
*/

class Animal{
	protected int age;
	Animal(){
		this(1);
	}
	Animal(int age){
		this.age = age;
	}
	void speak(){
		System.out.println("음 .. 어떻게 말해야 할까?");
	}
	public String toString(){
		return String.format("나이가 %d인 동물입니다.",age);
	}
}

class Dog extends Animal{
	protected String name;
	
	Dog(){
		this(3,"개똥이");
	}
	
	Dog(int age, String name){
		super.age = age; //  == super(age)
		this.name = name;
	}
	
	void speak(){
		System.out.println("난 강아지. 멍멍!");
	}
	
	void eat(){
		System.out.println("맛있어요~ 멍멍!");
	}
	
	public String toString(){
		return String.format("나이가 %d이고 이름은 %s인 강아지입니다.",this.age,name);
	}
	
}

class Cat extends Animal{
	protected String name;
	
	Cat(){
		this(2,"야옹이");
	}
	
	Cat(int age, String name){
		super.age = age; // == super(age)
		this.name = name;
	}
	
	void speak(){
		System.out.println("난 야옹이. 야옹!");
	}
	
	void eat(){
		System.out.println("맛있어요~ 야옹!");
	}
	
	public String toString(){
		return String.format("나이가 %d이고 이름은 %s인 고양이입니다.",this.age,name);
	}
	
}

class JindoDog extends Dog{
	protected String color;
	
	JindoDog(){
		this(5,"진도","하얀색");
	}
	
	JindoDog(int age, String name, String color){
		super.age = age; // super(age,name)
		super.name = name;
		this.color = color;
	}
	
	void hunt(){
		System.out.println("사냥하러가볼까요~");
	}
	
	public String toString(){
		return String.format("나이가 %d, 이름은 %s, %s인 진돗개입니다.",this.age,this.name,color);
	}
	
	public boolean equals(Object o){
		if(o instanceof JindoDog){
			JindoDog j = (JindoDog)o;
			if(this.age == j.age && this.name == j.name && this.color == j.color)
				return true;
			
			else return false; 
		}//return (this.age==j.age)&&this.name.equals(j.name)&&this.color.equals(j.color);
		else return false;
	}
}

class AnimalTest{
	public static void main(String [] args){
		Animal a = new Animal();
		a.speak();
		System.out.println(a.toString());
		Dog d1 = new Dog();
		Dog d2 = new Dog(6,"멍멍이");
		d1.speak();
		d2.eat();
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		Cat c1 = new Cat();
		Cat c2 = new Cat(7,"초롱이");
		c1.speak();
		c2.eat();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		Dog z1 = new JindoDog();
		Dog z2 = new JindoDog(10,"진도야","갈색");
		Dog z3 = new JindoDog(10,"진도야","갈색");
		z1.speak();
		z2.eat();
		((JindoDog)z3).hunt();
		System.out.println(z1.toString());
		System.out.println(z2.toString());
		System.out.println("z2과 z3가 같은 진돗개입니까? "+z2.equals(z3));
		System.out.println("d1과 z3가 같은 진돗개입니까? "+d1.equals(z3));
	}
}
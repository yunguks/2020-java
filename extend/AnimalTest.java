/* ���ǻ� ��� �ʵ� ���� �����ڴ� protected�� �Ѱ�
Animal 
 - age
 - speak() : �� .. ��� ���ؾ� �ұ�?
 - toString() : Animal�Դϴ�.
 
Dog
 - name
 - speak() : �� ������. �۸�!
 - eat() : ���־��~ �۸�!
 - toString() : Dog�Դϴ�.
 
Cat
 - name
 - speak() : �� �����. �߿�!
 - eat() : ���־��~ �߿�!
 - toString() : Cat�Դϴ�.
 
JindoDOg
 - Color
 - hunt() : ����Ϸ��������~
 - toString() : JindoDog�Դϴ�.
 - equals(Object o): ����, �̸�, ������ ���ٸ� ���� �������� �����ϵ��� ������
 
�߰�) �� Ŭ�������� ����Ʈ �����ڿ� ������ �ִ� ��� �ʵ带 �ʱ�ȭ�ϴ� �����ڸ� ���� �ۼ��Ͻÿ�.

AnimalTest ���� ������ ����
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
		System.out.println("�� .. ��� ���ؾ� �ұ�?");
	}
	public String toString(){
		return String.format("���̰� %d�� �����Դϴ�.",age);
	}
}

class Dog extends Animal{
	protected String name;
	
	Dog(){
		this(3,"������");
	}
	
	Dog(int age, String name){
		super.age = age; //  == super(age)
		this.name = name;
	}
	
	void speak(){
		System.out.println("�� ������. �۸�!");
	}
	
	void eat(){
		System.out.println("���־��~ �۸�!");
	}
	
	public String toString(){
		return String.format("���̰� %d�̰� �̸��� %s�� �������Դϴ�.",this.age,name);
	}
	
}

class Cat extends Animal{
	protected String name;
	
	Cat(){
		this(2,"�߿���");
	}
	
	Cat(int age, String name){
		super.age = age; // == super(age)
		this.name = name;
	}
	
	void speak(){
		System.out.println("�� �߿���. �߿�!");
	}
	
	void eat(){
		System.out.println("���־��~ �߿�!");
	}
	
	public String toString(){
		return String.format("���̰� %d�̰� �̸��� %s�� ������Դϴ�.",this.age,name);
	}
	
}

class JindoDog extends Dog{
	protected String color;
	
	JindoDog(){
		this(5,"����","�Ͼ��");
	}
	
	JindoDog(int age, String name, String color){
		super.age = age; // super(age,name)
		super.name = name;
		this.color = color;
	}
	
	void hunt(){
		System.out.println("����Ϸ��������~");
	}
	
	public String toString(){
		return String.format("���̰� %d, �̸��� %s, %s�� �������Դϴ�.",this.age,this.name,color);
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
		Dog d2 = new Dog(6,"�۸���");
		d1.speak();
		d2.eat();
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		Cat c1 = new Cat();
		Cat c2 = new Cat(7,"�ʷ���");
		c1.speak();
		c2.eat();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		Dog z1 = new JindoDog();
		Dog z2 = new JindoDog(10,"������","����");
		Dog z3 = new JindoDog(10,"������","����");
		z1.speak();
		z2.eat();
		((JindoDog)z3).hunt();
		System.out.println(z1.toString());
		System.out.println(z2.toString());
		System.out.println("z2�� z3�� ���� �������Դϱ�? "+z2.equals(z3));
		System.out.println("d1�� z3�� ���� �������Դϱ�? "+d1.equals(z3));
	}
}
/*
Animal Ŭ����
	-�ʵ� : age
	-�޼ҵ� : eat() : �Խ��ϴ�.
	-������ : ����Ʈ������ :("��������" ���� ���), ���̸� �ʱ�ȭ�ϴ� ������
Person Ŭ����	
	-�ʵ� : age, name
	-�޼ҵ� : eat(), walk() : �Ƚ��ϴ�.
	-������ : ����Ʈ������ :("�������" ���� ���), ���̿� �̸��� �ʱ�ȭ�ϴ� ������
Student Ŭ����
	-�ʵ� : age, name, grade
	-�޼ҵ� : eat(), walk(), study():�����մϴ�.
	-������ : ����Ʈ������ :("�л�����" ���� ���), ���̿� �̸� �г��� �ʱ�ȭ �ϴ� ������
*/
class Stonde{}
class Animal1{
	private int age;
	
	void eat(){
		System.out.println("�Խ��ϴ�.");
	}
	Animal1(){
		System.out.println("���� ����");
	}
	Animal1(int age){
		this.age = age;
	}
	public String toString(){
		return "����: "+age+"��";
	}
	int getAge(){
		return age;
	}
}

class Person1 extends Animal1{
	private String name;
	
	void walk(){
		System.out.println("�Ƚ��ϴ�.");
	}
	Person1(){
		System.out.println("��� ����");
	}
	Person1(int age, String name){
		super(age); // Animal(age);
		this.name = name;
	}
	public String toString(){
		return super.toString()+", �̸� : "+name;
	}
	String getName(){
		return name;
	}
}

class Student1 extends Person1{
	private int grade;
	
	void study(){
		System.out.println("�����մϴ�.");
	}
	Student1(){
		System.out.println("�л� ����");
	}
	Student1(int age, String name, int grade){
		super(age, name); // person(age, name);
		this.grade = grade;
	}
	/*�л��� �̸�, ����, �г��� ���ٸ� ���� �л����� ���ֵ��ϵ��� equals() �޼ҵ�
	�ߺ����� ��
	public boolean equals(Student1 st){//s1.equals(s2) , this.age == s1.age s1���� ȣ��
		if(this.getAge() == st.getAge() && this.getName().equals(st.getName()) 
		&& this.grade == st.grade) return true;
		else return false;
	}*/
	
	public boolean equals(Object o){//s1.equals(s2) s2-object���� ���ٰ��� �׷���(Student1)ĳ����
	/* ������ 
	Object o = s2; ��ĳ���� 
	��� ĳ���� �� �ʿ���� Student1 s = (Studnet1)o; / �ٿ�ĳ���� ����� ���ܰ� �߻��� ���� �ִ� �ڵ�
	���� o�� �л��̶�� >> ��ü�� instanceof Ŭ������ : �ش� ��ü�� �ش� Ŭ������ �ν��Ͻ���(��ü��) �˷���
	 stone instanceof student1 a�� ��� ���谡 ���� ���� ������ ������ x , ��� ������ ������ o
	*/
	if(o instanceof Student1){
		Student1 s = (Student1)o;
		if(this.getAge() == ((Animal1)o).getAge() && this.getName().equals(((Student1)o).getName()) 
		&& this.grade == s.grade) return true;
		else return false;
	}
	//o�� �л��� �ƴ϶�� false ��ȯ
	else return false;
	}
	
	//toString �޼ҵ� ������
	public String toString(){
		return super.toString()+", �г� : "+grade;
	}
	
	//�л� ����
	public static void main(String [] args){
		new Student(); // �ѹ��� ���� �ʴ°�� �ٿ��� �������. ������ �Ѵ�.
		Student1 s1 = new Student1();
		Student1 student = new Student1();//�л� ��ü�� �ڷ����� student Ÿ������ �д�.
		//�л� �Ѹ� ������ �� �л��̶� �Ѵ�.
		Person1 p = new Student1();//�л����� ����̶�� ��, ����
		Animal1 a = new Student1();//�л����� �����̶�� ��, ���� 
		Object o = new Student1();//�л����� �繰�̶�� ��, ���� �⺻ ������Ʈ Ŭ����
		a.eat();
		((Student1)a).study(); // a. �� ���� ���� / �ٿ�ĳ����: ��Ӱ��谡 ���� �� ������ ����.
		/*Stone s = new Student1();// ��Ӱ����� Ŭ������ ����
		��ü ��ü�� ������ ���� ��ü�� �θ��� ���� �����ϸ� ��ĳ�����̶�� ��.
		a.walk() �Ұ��� - Animal�� �Ӽ��� ���� ����, ����� �� �ִ� �ʵ�, �޼ҵ忡 ������ �߻�
		������ �ִ� ���� ��ü�� �θ��� ���� �ٿ�ĳ�����̸� �Ұ����� highschoolstudent hss = new student;
		*/
		Stone stone = new Stone();
		Animal1 a1 = new Animal1();
		System.out.println(a1 instanceof Object); //true
		System.out.println(a1 instanceof Animal1); //true
		System.out.println(a1 instanceof Person1); //false
		System.out.println(a1 instanceof Student1); //false
		
		Student1 s2 = new Student1(24, "������", 2);
		Student1 s3 = new Student1(24, "������", 2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s2.getClass().getName());
		System.out.println("s1�л��� ���� ����??"+s1.equals(stone)); //�����Ҷ� ���� �л����� ĳ���� �Ұ�
		System.out.println("s1, s2 ���� �л�??"+s1.equals(s2));
		System.out.println("s2, s1 ���� �л�??"+s2.equals(s1));
		System.out.println("s2, s3 ���� �л�??"+s2.equals(s3));
	}
	
}
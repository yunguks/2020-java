/*
Animal 클래스
	-필드 : age
	-메소드 : eat() : 먹습니다.
	-생성자 : 디폴트생성자 :("동물생성" 문장 출력), 나이를 초기화하는 생성자
Person 클래스	
	-필드 : age, name
	-메소드 : eat(), walk() : 걷습니다.
	-생성자 : 디폴트생성자 :("사람생성" 문장 출력), 나이와 이름을 초기화하는 생성자
Student 클래스
	-필드 : age, name, grade
	-메소드 : eat(), walk(), study():공부합니다.
	-생성자 : 디폴트생성자 :("학생생성" 문장 출력), 나이와 이름 학년을 초기화 하는 생성자
*/
class Stonde{}
class Animal1{
	private int age;
	
	void eat(){
		System.out.println("먹습니다.");
	}
	Animal1(){
		System.out.println("동물 생성");
	}
	Animal1(int age){
		this.age = age;
	}
	public String toString(){
		return "나이: "+age+"세";
	}
	int getAge(){
		return age;
	}
}

class Person1 extends Animal1{
	private String name;
	
	void walk(){
		System.out.println("걷습니다.");
	}
	Person1(){
		System.out.println("사람 생성");
	}
	Person1(int age, String name){
		super(age); // Animal(age);
		this.name = name;
	}
	public String toString(){
		return super.toString()+", 이름 : "+name;
	}
	String getName(){
		return name;
	}
}

class Student1 extends Person1{
	private int grade;
	
	void study(){
		System.out.println("공부합니다.");
	}
	Student1(){
		System.out.println("학생 생성");
	}
	Student1(int age, String name, int grade){
		super(age, name); // person(age, name);
		this.grade = grade;
	}
	/*학생의 이름, 나이, 학년이 같다면 같은 학생으로 간주도하도록 equals() 메소드
	중복정의 임
	public boolean equals(Student1 st){//s1.equals(s2) , this.age == s1.age s1에서 호출
		if(this.getAge() == st.getAge() && this.getName().equals(st.getName()) 
		&& this.grade == st.grade) return true;
		else return false;
	}*/
	
	public boolean equals(Object o){//s1.equals(s2) s2-object에만 접근가능 그래서(Student1)캐스팅
	/* 다형성 
	Object o = s2; 업캐스팅 
	계속 캐스팅 할 필요없이 Student1 s = (Studnet1)o; / 다운캐스팅 실행시 예외가 발생할 수도 있는 코드
	만약 o가 학생이라면 >> 객체명 instanceof 클래스명 : 해당 객체가 해당 클래스의 인스턴스냐(객체냐) 알려줌
	 stone instanceof student1 a가 상속 관계가 존재 하지 않으면 컴파일 x , 상속 관계라면 컴파일 o
	*/
	if(o instanceof Student1){
		Student1 s = (Student1)o;
		if(this.getAge() == ((Animal1)o).getAge() && this.getName().equals(((Student1)o).getName()) 
		&& this.grade == s.grade) return true;
		else return false;
	}
	//o가 학생이 아니라면 false 반환
	else return false;
	}
	
	//toString 메소드 재정의
	public String toString(){
		return super.toString()+", 학년 : "+grade;
	}
	
	//학생 생성
	public static void main(String [] args){
		new Student(); // 한번도 쓰지 않는경우 붙여도 상관없다. 생성만 한다.
		Student1 s1 = new Student1();
		Student1 student = new Student1();//학생 객체의 자료형을 student 타입으로 둔다.
		//학생 한명 생성한 뒤 학생이라 한다.
		Person1 p = new Student1();//학생에게 사람이라고 함, 가능
		Animal1 a = new Student1();//학생에게 동물이라고 함, 가능 
		Object o = new Student1();//학생에게 사물이라고 함, 가능 기본 오브젝트 클래스
		a.eat();
		((Student1)a).study(); // a. 가 먼저 계산됨 / 다운캐스팅: 상속관계가 있을 때 컴파일 가능.
		/*Stone s = new Student1();// 상속가능한 클래스만 가능
		실체 객체를 상위의 높은 객체로 부르는 것이 가능하며 업캐스팅이라고 함.
		a.walk() 불가능 - Animal의 속성만 가능 접근, 사용할 수 있는 필드, 메소드에 제약이 발생
		하위에 있는 낮은 객체로 부르는 것은 다운캐스팅이며 불가능함 highschoolstudent hss = new student;
		*/
		Stone stone = new Stone();
		Animal1 a1 = new Animal1();
		System.out.println(a1 instanceof Object); //true
		System.out.println(a1 instanceof Animal1); //true
		System.out.println(a1 instanceof Person1); //false
		System.out.println(a1 instanceof Student1); //false
		
		Student1 s2 = new Student1(24, "이윤석", 2);
		Student1 s3 = new Student1(24, "이윤석", 2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s2.getClass().getName());
		System.out.println("s1학생과 돌이 동일??"+s1.equals(stone)); //실행할때 돌이 학생으로 캐스팅 불가
		System.out.println("s1, s2 동일 학생??"+s1.equals(s2));
		System.out.println("s2, s1 동일 학생??"+s2.equals(s1));
		System.out.println("s2, s3 동일 학생??"+s2.equals(s3));
	}
	
}
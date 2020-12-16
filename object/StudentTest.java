import java.util.Scanner;

class Student{
	private String name;
	private int age;
	private double score;
	
	String getName(){
		return name;
	}
	
	int getAge(){
		return age;
	}
	
	double getScore(){
		return score;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	void setAge(int a){
		if(a>=0 && a<=200) age = a;
		else age = 0;
	}
	
	void setScore(double b){
		if(score >= 0 && score <= 4.3) score = b;
		else score = 0;
	}
	
	Student(){
		this("ȫ�浿",20,3);
	}
	
	Student(String name, int age, double score){
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public String toString(){
		return String.format("�̸�: %s, ����: %d, ����: %.1f",name,age,score);
	}
}

class StudentTest{
	public static void main(String [] args){
		Student s1 = new Student();
		Student s2 = new Student("ȫ�浿", 24, 4.3);
		System.out.println("�л����� \n"+s1);
		System.out.println("������ 4.3���� �����մϴ�.");		
		System.out.println("�л����� \n"+s2);
			
	}
}
	
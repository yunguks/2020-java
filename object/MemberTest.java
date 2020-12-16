import java.util.Scanner;

class Member{
	String name;
	int age;
	static int number;
	
	Member(){
		this.name = "이름";
		this.age = 20;
		System.out.println("디폴트 생성자 통해 동호회 멤버 생성");
		number++;
	}
	
	Member(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("이름과 나이가 존재하는 동호회 멤버 생성");
		number++;
	}
}

class MemberTest{
	public static void main(String [] args){
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		Member m4 = new Member("나나", 30);
		
		System.out.printf("이 동호회의 멤버 수는 %d 명입니다.",Member.number);
	}
}
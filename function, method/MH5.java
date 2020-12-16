import java.util.Scanner;
import java.lang.Math;

class MH5{
	public static void main(String [] args){
		Dog myDog = new Dog();
		Dog dog2 = new Dog("뽀비",5);
		Dog dog3 = new Dog("나비",10);
		myDog.my();
		myDog.play();
		myDog.eat();
		System.out.println(myDog);
		System.out.println(dog2);
		System.out.println(dog3);
		
	}
}
	
class Dog{
		String name ;
		int full,b, age;
		Scanner s = new Scanner(System.in);
		
		/*생성자 : 객체 생성시 필드값을 초기화하는 메소드
		생성자를 작성하지 않는 상황에서는 자바에서 디폴트 생성자 자동 작성
		*/
		Dog(){
			/*age = 5;
			name = "개똥이";
			full = 4;
			*/
			this(개똥이,5,4); 
		}
		
		Dog(String name,int age){
			this.name = name;
			this.age = age;
		}
		
		Dog(String name, int age, int full){
			this(name, age); //this = Dog 항상 생성자 코드 맨 처음에만 다른 생성자 호출 가능, 다른생성자는 딱하나만 호출가능
			/*this.name = name;
			this.age = age;*/
			this.full = full;
		}
		
		void my(){
			System.out.printf("내 강아지의 이름은 %s, 포만감은 %d입니다.\n",name,full);
		}
		
		void eat(){
			System.out.printf("먹이 개수: ");
			b = s.nextInt();
			
			if(b<0) System.out.println("먹을걸로 장난치지 마세요~!");
			else {
				if(full+b<10){
					full += b;
					System.out.printf("잘 먹었습니다. ^__^. 포만감이 %d이 되었습니다.\n",full);
				}
				else {
					full=10;
					System.out.printf("배터지지 않을 만큼만 적당히 잘 먹었습니다. ^__^. 포만감이 %d이 되었습니다.\n",full);					
				}
			}
		}
		
		void play(){
			if(full>=7) System.out.println("재미있네요~ ^__^");
			else System.out.println("배가 고파요 ㅜ__ㅜ");
		}
		
		public String toString(){
			return String.format("내 강아지 %s의 나이는 %d 포만감은 %d입니다.",name,age,full);
		}
}
import java.util.Scanner;
import java.lang.Math;

class MH5{
	public static void main(String [] args){
		Dog myDog = new Dog();
		Dog dog2 = new Dog("�Ǻ�",5);
		Dog dog3 = new Dog("����",10);
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
		
		/*������ : ��ü ������ �ʵ尪�� �ʱ�ȭ�ϴ� �޼ҵ�
		�����ڸ� �ۼ����� �ʴ� ��Ȳ������ �ڹٿ��� ����Ʈ ������ �ڵ� �ۼ�
		*/
		Dog(){
			/*age = 5;
			name = "������";
			full = 4;
			*/
			this(������,5,4); 
		}
		
		Dog(String name,int age){
			this.name = name;
			this.age = age;
		}
		
		Dog(String name, int age, int full){
			this(name, age); //this = Dog �׻� ������ �ڵ� �� ó������ �ٸ� ������ ȣ�� ����, �ٸ������ڴ� ���ϳ��� ȣ�Ⱑ��
			/*this.name = name;
			this.age = age;*/
			this.full = full;
		}
		
		void my(){
			System.out.printf("�� �������� �̸��� %s, �������� %d�Դϴ�.\n",name,full);
		}
		
		void eat(){
			System.out.printf("���� ����: ");
			b = s.nextInt();
			
			if(b<0) System.out.println("�����ɷ� �峭ġ�� ������~!");
			else {
				if(full+b<10){
					full += b;
					System.out.printf("�� �Ծ����ϴ�. ^__^. �������� %d�� �Ǿ����ϴ�.\n",full);
				}
				else {
					full=10;
					System.out.printf("�������� ���� ��ŭ�� ������ �� �Ծ����ϴ�. ^__^. �������� %d�� �Ǿ����ϴ�.\n",full);					
				}
			}
		}
		
		void play(){
			if(full>=7) System.out.println("����ֳ׿�~ ^__^");
			else System.out.println("�谡 ���Ŀ� ��__��");
		}
		
		public String toString(){
			return String.format("�� ������ %s�� ���̴� %d �������� %d�Դϴ�.",name,age,full);
		}
}
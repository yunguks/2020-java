import java.util.Scanner;

class Book{
		String title,name;
		int page, price;
		static int numOfBooks; // static Ű���� = ��� Ŭ������ �����ϴ� �ʵ尡 �� ;
		
		Book(){
			this("�Ŀ��ڹ�", "õ�α�", 600, 25000);
		}
		
		Book(String title, int price){
			numOfBooks++;
			this.title = title;
			this.price = price;
		}
		
		Book(String title, String name, int page, int price){
			this(title,price);
			this.name = name;
			this.page = page;
		}
		void speak(){
			//static �޼ҵ�� ��� ��ü�� ������ ����� ������, static ���� ����� ��밡��
			System.out.format("%s�� ���ڴ� %s�̸� �� �������� %d, ������ %d���Դϴ�.",title,name,page,price);
		}
		public String toString(){
			return String.format("%s�� ���ڴ� %s�̸� �� �������� %d, ������ %d���Դϴ�.",title,name,page,price);
		}
		
}

class BookTest{
	public static void main(String [] args){
		Book b1 = new Book();
		Book b2 = new Book("��Ž�� �ڳ�",5500);
		Book b3 = new Book("¯���� ������", "����", 100, 8000);
		Book b4 = new Book("�ҳ�Ž�� ������", 6000);
		
		System.out.println("ù��° å: "+b1);
		System.out.println("�ι�° å: "+b2);
		System.out.println("����° å: "+b3);
		System.out.println("�׹�° å: "+b4);
		
		System.out.printf("�������� ������ å�� %d�� �Դϴ�.", Book.numOfBooks);
		
		return;
	}
}
		
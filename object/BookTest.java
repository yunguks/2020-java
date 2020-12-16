import java.util.Scanner;

class Book{
		String title,name;
		int page, price;
		static int numOfBooks; // static 키워드 = 모든 클래스가 공유하는 필드가 됨 ;
		
		Book(){
			this("파워자바", "천인국", 600, 25000);
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
			//static 메소드는 모든 객체가 동일한 결과를 내야함, static 변수 멤버만 사용가능
			System.out.format("%s의 저자는 %s이며 총 페이지는 %d, 가격은 %d원입니다.",title,name,page,price);
		}
		public String toString(){
			return String.format("%s의 저자는 %s이며 총 페이지는 %d, 가격은 %d원입니다.",title,name,page,price);
		}
		
}

class BookTest{
	public static void main(String [] args){
		Book b1 = new Book();
		Book b2 = new Book("명탐정 코난",5500);
		Book b3 = new Book("짱구는 못말려", "누구", 100, 8000);
		Book b4 = new Book("소년탐정 김전일", 6000);
		
		System.out.println("첫번째 책: "+b1);
		System.out.println("두번째 책: "+b2);
		System.out.println("세번째 책: "+b3);
		System.out.println("네번째 책: "+b4);
		
		System.out.printf("이제까지 생성된 책은 %d권 입니다.", Book.numOfBooks);
		
		return;
	}
}
		
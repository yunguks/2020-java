import java.util.Scanner;

class HelloJava{
	public static void main(String [] args){
		String st;
		Scanner s = new Scanner(System.in);
		int len, a=0;
		char c,sw;
		
		System.out.print("문자열: ");
		st = s.nextLine();
		System.out.print("문자: ");
		sw = s.nextLine().charAt(0);
		
		len = st.length();
		for(int i=0;i<len;i++)
		{
			c = st.charAt(i);
			if(c==sw) {
				System.out.printf("%d 번째 ",i+1);
				a++;
			}
		}
		System.out.printf("\n문자열 \"%s\"에서 문자 '%s'는 %d번 검색되었습니다.",st,sw,a);
	}
}
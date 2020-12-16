import java.util.Scanner;

class StringTest{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String st;
		int len, x, a, b, tmp;
		
		/*System.out.print("문자열: ");
		st = s.nextLine();
		
		len = st.length();
		
		while(true){
			System.out.print("x: ");
			x = s.nextInt();
			if(x>=1 && x<=len) break;
			System.out.println("[입력오류]문자열의 길이 이하의 양수를 입력해주세요.");
		}
		System.out.printf("%d번째 문자는 '%c'입니다\n", x, st.charAt(x-1));
		*/
		System.out.print("문자열: ");
		st = s.nextLine();
		
		len = st.length();
		
		while(true){
			System.out.print("a: ");
			a = s.nextInt();
			if(a>=1 && a<=len) break; 
			System.out.println("[입력오류]a는 문자열의 길이 이하의 양수를 입력해주세요.");
		}
		while(true){
			System.out.print("a: ");
			b = s.nextInt();
			if(b>=1 && b<=len) break;
			System.out.println("[입력오류]b는 문자열의 길이 이하의 양수를 입력해주세요.");
		}
		if(a>b){
			//a b에 저장된 값 교환
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.printf("문자열 \"%s\"에서 %d부터 %d까지 추출한 문자열은 \"%s\"입니다", st,a,b,st.substring(a-1,b));
		
	}
}
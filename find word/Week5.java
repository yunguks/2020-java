import java.util.Scanner;

class Week5{
	public static void main(String [] args){
		String x, y, line, word;
		Scanner s = new Scanner(System.in);
		int a, b, k=1, n=0;
		
		System.out.print("문장: ");
		x = s.nextLine();
		System.out.print("검색할 단어: ");
		y = s.nextLine();
		
		a = x.length();
		b = y.length();
		
		line = x.toLowerCase();
		word = y.toLowerCase();
		
		for(int i=0;i<a;i++)
		{
			if(line.charAt(i) == ' ') k++;
				
			if(line.charAt(i) == word.charAt(0))
				if(line.substring(i,i+b).equalsIgnoreCase(word))
				{
					n++;
					System.out.printf("%d 번째 ",k);
				}
		}
	if(n==0) System.out.printf("총 %d회 검색되었습니다.",n);
		else System.out.printf("어절에서 \"%s\"가(이) 검색되어, 총 %d회 검색되었습니다.",y,n);
	}
}
		
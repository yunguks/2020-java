import java.util.Scanner;

class Abcd{
	public static void main(String [] args){
		int x, y, r, ch;
		Scanner s = new Scanner(System.in);
		
		System.out.print("x : ");
		x = s.nextInt();
		System.out.print("y : ");
		y = s.nextInt();
		
		if(x<y) { ch=x; x=y; y=ch;}
		
		if(y==0) System.out.printf("최대공약수는 %d", x);
		
		r = x % y;
		
		while(r!=0)
		{
			x = y;
			y = r;
			r = x % y;
		}
		x=y;
		System.out.printf("최대공약수는 %d", x);
	}
}

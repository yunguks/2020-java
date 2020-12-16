import java.util.Scanner;

class Abc{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b,sw;
		
		System.out.print("a : ");
		a = s.nextInt();
		System.out.print("b : ");
		b = s.nextInt();

		if(a>b) {sw=a; a=b; b=sw;}
		
		for(int k=a;k<b+1;k++)
		{
			System.out.printf("%dÀÇ ¾à¼ö: ",k);
			for(int i=1;i<b;i++)
			{
				if((k%i)==0) System.out.printf("%d ",i);
			}
			System.out.print("\n");
		}
	}
}

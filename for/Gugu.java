import java.util.Scanner;

class Gugu{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a,k;
		
		System.out.print("¸î ´Ü : ");
		a = s.nextInt();
		
		for(k=0;k<9;k++)
		{
			System.out.printf("%d X %d = %d\n",a,k+1,a*(k+1));
		}
	}
}
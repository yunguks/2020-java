import java.util.Scanner;

class Line{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int x,y,z;
		
		System.out.print("¶óÀÎ ¼ö : ");
		x = s.nextInt();
		
		for(int i=x;i>0;i--)
		{
			for(int j=i;j>0;j--)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i=x;i>0;i--)
		{
			for(int k=i;k>0;k--)
				System.out.print("*");
			System.out.println();
			for(int j=0;j<x-i+1;j++)
				System.out.print(" ");
		}
		
		for(int i=0;i<x+1;i++)
		{
			for(int j=x-i;j>0;j--)
				System.out.print(" ");
			for(int k=0;k<(2*i-1);k++)
				System.out.print("*");
			for(int j=x-i;j>0;j--)
				System.out.print(" ");
			System.out.println();
		}
	}
}
		
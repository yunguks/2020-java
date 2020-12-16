import java.util.Scanner;
import java.lang.Math;

class MH2{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		int a, b,tmp;
		
		System.out.printf("a: ");
		a = s.nextInt();
		System.out.printf("b: ");
		b = s.nextInt();
		
		if(a<b){
			tmp = a;
			a = b;
			b = tmp;
		}
		
		if((b%2)==1){
			for(int i=b;i<a;i=i+2){
				if(i<5) System.out.printf("(%d, %.2f)\n",i,3*(Math.sin(i)));
				else System.out.printf("%d, %.2f)\n",i,Math.sqrt((i-1)*(i-4)));
			}
		}
		else for(int i=b+1;i<a+1;i=i+2) {
				if(i<4) System.out.printf("(%d, %.2f)\n",i,3*(Math.sin(i)));
				else System.out.printf("(%d, %.2f)\n",i,Math.sqrt((i-1)*(i-4)));
			}
		}
	}

				
			
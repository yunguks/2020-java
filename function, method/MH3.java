import java.util.Scanner;

class MH3{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String st, word;
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0;
		
		System.out.println("πÆ¿Â :");
		st = s.nextLine();
		
		word = st.toUpperCase();
		
		for(int i=0;i<word.length();i++){
			switch(word.charAt(i)){
				case 'D': a1++;
				break;
				case 'E': a2++;
				break;
				case 'H': a3++;
				break;
				case 'L': a4++;
				break;
				case 'O': a5++;
				break;
				case 'R': a6++;
				break;
				case 'W': a7++;
				break;
			}
		}
		System.out.printf("'D': %d\n",a1);
		System.out.printf("'E': %d\n",a2);
		System.out.printf("'H': %d\n",a3);
		System.out.printf("'L': %d\n",a4);
		System.out.printf("'O': %d\n",a5);
		System.out.printf("'R': %d\n",a6);
		System.out.printf("'W': %d\n",a7);
	}
}
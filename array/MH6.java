import java.util.Scanner;

class MH6{
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String word;
		char [] arr, tmp;
		int a;
		
		System.out.printf("���ڿ�: ");
		word = s.nextLine();
		
		a = word.length();
		arr = new char[a];
		
		for(int i=0; i<a; i++) arr[i]= word.charAt(i);
		
		System.out.printf("���Ӹ� :");
		for(int i=0; i<a-1; i++){
			if(i==0) System.out.printf("%c",arr[i]);
			if(arr[i]==' ') System.out.printf("%c",arr[i+1]);
		}
		System.out.println();
		
		System.out.printf("�������� :");
		for(int i=a-1; i>=0; i--) System.out.printf("%c",arr[i]);
	}
}
			
				
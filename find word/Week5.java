import java.util.Scanner;

class Week5{
	public static void main(String [] args){
		String x, y, line, word;
		Scanner s = new Scanner(System.in);
		int a, b, k=1, n=0;
		
		System.out.print("����: ");
		x = s.nextLine();
		System.out.print("�˻��� �ܾ�: ");
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
					System.out.printf("%d ��° ",k);
				}
		}
	if(n==0) System.out.printf("�� %dȸ �˻��Ǿ����ϴ�.",n);
		else System.out.printf("�������� \"%s\"��(��) �˻��Ǿ�, �� %dȸ �˻��Ǿ����ϴ�.",y,n);
	}
}
		
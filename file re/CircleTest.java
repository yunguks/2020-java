import java.io.*;
import java.util.Scanner;

class CircleTest{
	public static void main(String [] args) throws FileNotFoundException{
		if(args.length!=1){
			System.out.println("[����]java CircleTest �������������ϸ�");
			System.exit(1);
		}
		
		File f1 = new File("���� �������� ����.java");
		File f2 = new File(args[0]);
		
		if(f1.exists()==false){
			System.out.printf("\"%s\" ������ �������� �ʽ��ϴ�. Ȯ�����ּ���.\n", f1.getName());
			System.exit(1);				
		}else if(f2.exists()==true){
			System.out.printf("\"%s\" ������ �̹� �����մϴ�. ���ο� ���ϸ��� �Է����ּ���.\n", f2.getName());
			System.exit(1);				
		}
		int r,i=0;
		double c;
		
		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);
		while(s.hasNext()==true){
			i++;
			r = s.nextInt();
			c = s.nextDouble();
			if(c==(r*r*3.14)){
				pw.printf("%d��° ���� ���̴� ����� ���������ϴ�: ������(%d), ����(%.2f)\n",i,r,c);
			}
			else pw.printf("%d��° ���� ���̴� �߸� ���߽��ϴ�: �������� %d�� ��� ���̴� %.2f�� �ƴ϶� %.2f�Դϴ�..\n",i,r,c,r*r*3.14);
		}
		s.close();
		pw.close();
		System.out.println("�ҽ������� ��ġ�� ������ ��� ������ �����Ǿ����ϴ�.Ȯ���غ�����.");
	}
	
}
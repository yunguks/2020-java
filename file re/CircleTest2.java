import java.io.*;
import java.util.Scanner;

class CircleTest2{
	public static void main(String [] args) throws Exception{
		if(args.length!=1){
			System.out.println("[����]java CircleTest2 �й�.java");
			System.exit(1);
		}
		int r;
		double a;
		
		File f1 = new File(args[0]);
		File f2 = new File("���� �������� ����.java");
		if(f1.exists()==true){
			System.out.printf("\"%s\" ������ �̹� �����մϴ�. ���ο� ���ϸ��� �Է����ּ���.",f1.getName());
		}
		
		Scanner s = new Scanner(f2);
		PrintWriter pw = new PrintWriter(f1);
		
		while(s.hasNext()){
			int i=1;
			r = s.nextInt();
			a = s.nextDouble();
			if(a==r*r*3.14){
				System.out.printf("%d��° ���� ���̴� ����� ���������ϴ�. ������(%d), ����(%.2f)\n",i,r,a);
				pw.printf("%d��° ���� ���̴� ����� ���������ϴ�. ������(%d), ����(%.2f)\n",i,r,a);
			}
			else {
				System.out.printf("%d��° ���� ���̴� �߸� ���߽��ϴ�. �������� %d�� ��� ���̴� %.2f�� �ƴ϶� %.2f �Դϴ�.\n",i,r,a,r*r*3.14);
				pw.printf("%d��° ���� ���̴� �߸� ���߽��ϴ�. �������� %d�� ��� ���̴� %.2f�� �ƴ϶� %.2f �Դϴ�.\n",i,r,a,r*r*3.14);
			}
		}
		s.close();
		pw.close();
		
	}
}
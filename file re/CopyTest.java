/*���� ���� ���α׷�
java CopyFile �������ϸ� ���纻���ϸ� - Ŀ��� ���� 

java CopyFile abc.txt copy.txt
Ŀ�ǵ���� ���ڰ� 2���� �ƴ϶�� ���α׷� ����
������ ���纻�� �����ϱ� 
������ �������� �ʴ´ٸ� ���� �˸��� ���α׷� ����
���纻 ������ �̹� �����Ѵٸ� �̹� ������ �����Ѵٰ� �˸��� ����
���� ���� �� �ܼ�â�� ���� ����Ϸ�
*/
import java.io.*;
import java.util.Scanner;

class CopyFile{
	public static void main(String [] args){
		if(args.length!=2){
			System.out.println("[����]java CopyFile �������ϸ� ���纻���ϸ�");
			return;
		}
		File [] f = {new File(args[0]), new File(args[1])};

		if(f[0].exists()==false){
			System.out.print("������ �������� �ʽ��ϴ�.\n[����]java CopyFile �������ϸ� ���纻���ϸ�");
			System.exit(1);
		}
		else if(f[1].exists()==true){
			System.out.print("���纻�� �����մϴ�.\n[����]java CopyFile �������ϸ� ���纻���ϸ�");
			System.exit(1);
		}
		
		Scanner s = null;
		PrintWriter pw = null;
		try{
			s = new Scanner(f[0]);
			pw = new PrintWriter(f[1]);
			while(s.hasNext()==true){
				//System.out.println(s.nextLine());
				pw.printf("%s\r\n",s.nextLine());
			}
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}finally{
			s.close();
			pw.close();
			System.out.printf("[����Ϸ�]���� ������ %s������ Ȯ�����ּ���. \n", f[1].getName());
		}
		
		

	}
}
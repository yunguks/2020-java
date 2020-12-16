/*�ܾ� ��ü ���α׷�
java ReplaceFile �������ϸ� ��ü�����ϸ� ���ܾ� �Ŵܾ�- Ŀ��� ���� 

java CopyFile abc.txt copy.txt word1 word2
Ŀ�ǵ���� ���ڰ� 4���� �ƴ϶�� ���α׷� ����
�������� ���ܾ �˻��Ǹ� �Ŵܾ�� ��ü�Ͽ� ��ü���� �ۼ��ϱ� 
������ �������� �ʴ´ٸ� ���� �˸��� ���α׷� ����
��ü�� ������ �̹� �����Ѵٸ� �̹� ������ �����Ѵٰ� �˸��� ����
�ܾ� ��ü �� �ܼ�â�� �ܾ��ü�Ϸ��� �˸���
*/

import java.io.*;
import java.util.Scanner;

class ReplaceFile{
	public static void main(String [] args) throws Exception{
		if(args.length!=4){
			System.out.println("[����]java ReplaceFile �������ϸ� ��ü�����ϸ� ���ܾ� �Ŵܾ�");
			System.exit(1);
		}
		String s1=args[2];
		String s2=args[3];
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		
		if(f1.exists()==false){
			System.out.println("���������� �������� �ʽ��ϴ�.");
			System.exit(1);
		}else if(f2.exists()==true){
			System.out.printf("%s�� �̹� �����մϴ�.",f2.getName());
		}
		
		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);

		while(s.hasNext()==true){
			pw.printf("%s\r\n",s.nextLine().replaceAll(s1,s2));
		}
	
		s.close();
		pw.close();
		System.out.printf("[�ܾü�Ϸ�]���� ������ %s������ Ȯ�����ּ���. \n", f2.getName());
		
	}
}
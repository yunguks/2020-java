import java.util.Scanner;
import java.io.*;

class WriteTest{
	public static void main(String [] args){
		//����ڿ��� �̸��� ���̸� �Է¹޾� �׳��� "Man. java"���Ͽ� ����
		Scanner s = new Scanner(System.in);
		File f = new File("Man.java");
		String name;
		int age;
		PrintWriter pw = null;//finally���� pw�� �ʱ�ȭ�� �ȵ� ������ ����
		
		System.out.println("����? "+f.exists());
		
		try{
			pw = new PrintWriter(f);//������ �ۼ�
			System.out.println("����? "+f.exists());
			for(int i=0; i<3; i++){
				System.out.print("�̸�: ");
				name = s.nextLine();
				System.out.print("����: ");
				age = s.nextInt();
				s.nextLine();//nextLine�� ���͵� �޾Ƽ� ���۷� ���� ����
				
				pw.printf("%s %d\r\n",name,age);//pw�� ����Ʈ�Ѵ�. ���� = \r\n
				//pw.close(); //�ֶ� ������ f�� �Ѿ��. �ڿ�����
			}
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}finally{
			pw.close(); //pw�� try �ȿ� �ձ⋚���� pw���� ������
		}
		System.out.printf("���� ������ %s������ Ȯ�����ּ���. \n", f.getName());
	}
}
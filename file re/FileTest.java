import java.io.*;

class FileTest{
	public static void main(String [] args){
		File hw13 = new File("ABC"+File.separator+"����13.pdf"); 
		//="ABC\\����13.pdf" ������� ���������� �Ѵ� ����ϱ� ����
		//��� ���: ��������(class ������ ��ġ�ϴ� ��)���� ����
		File abc = new File("C:\\Users\\Lee\\Desktop\\����\\abc.txt");//���� ���
		//����� \~ \n \t \b \r �̴�     \��ü�� �Ϸ��� \\ �� �ؾ��Ѵ�.
		File [] files = {new File("All.class"), new File("ABC"), new File("week12.pdf"), new File("FileTest.java")};
		
		for(File f:files){
			System.out.println(f.getName());
			System.out.println(f.exists());
			System.out.println(f.isFile());
			System.out.println(f.getAbsolutePath());
			System.out.println(new java.util.Date(f.lastModified())); //������ ������¥ > ����Ʈ Ŭ����
		}
		
		
		System.out.println("����? "+hw13.exists());//�����ϸ� true
		System.out.println("����? "+abc.exists());//���� x false
		System.out.println("�����̸� : "+abc.getName()); //�����̸� abc.txt 
		System.out.println("����? "+abc.isFile()); //�����̳� ������ ture
		System.out.println("����? "+abc.isDirectory());//���丮�� �����̳� false 
		System.out.println("������? "+abc.isAbsolute()); // ������ true or false
		System.out.println("����ũ�� : "+abc.length()); //���� ũ�� ��ȯ
		System.out.println("�б� ����? "+abc.canRead()); //�б� ����
		System.out.println("���� ����? "+abc.canWrite()); //���� ����
		
		System.out.println(hw13.isAbsolute());
		System.out.println("������ : "+hw13.getAbsolutePath()); //������ ǥ��
	}
}
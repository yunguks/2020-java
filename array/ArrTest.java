import java.util.Scanner;

class ArrTest{
	public static void main(String [] args){
		double [] scores2;
		int num, index;
		Scanner s = new Scanner(System.in);
		
		System.out.print("�л���: ");
		num = s.nextInt();
	
		scores2 = new double[num];
		
		for(int i=0; i<scores2.length ; i++)
		{
			System.out.print(i+1+"�� �л� ����: ");
			scores2[i] = s.nextDouble();
		}
		while(true){
			System.out.print("�� �� �л�? ");
			index = s.nextInt();
			if(index>=1 && index<=scores2.length) break;
			System.out.printf("[�Է¿���]1������ %d�������� �л��� �����մϴ�.\n",scores2.length);
			
		}
		System.out.printf("%d�� �л��� ������ %.2f�Դϴ�.\n",index, scores2[index-1]);
		
		for(double x : dArr){
			System.out.println(x);
		}
	}
} 
		/*for-each��
		for(�ڷ��� ������ : �迭��){    - �ϳ��� ������ ����ǰ� �ݺ����� ���� ������ �����Ѵ�
		�ݺ��� ���� } 					��� ���� ����� �� ������
		*/
		
		/* int [] arr = new int[4]
		int [] < ������ �����ϴ� �迭�̴�
		   = new int[4] ���� 4���� �����ϴ� �迭�̴� �װ����� �ּҸ� arr�� ����
		
		double [] dArr = {2.3, 4.5, 3, 10.3, 10.5};
		
		for(int i=0; i<dArr.length; i++)
		System.out.print(dArr[i]+" ");
		//�迭�� ���� > �迭��.length      �ʵ�� �����ϱ� ������ ()x
		//���ڿ��� ���� > ���ڿ�.length()
		*/

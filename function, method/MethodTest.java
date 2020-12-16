class MethodTest{
	public static void main(String [] args){
		//Ŀ�ǵ���ο� �ΰ��� �Էµ��� ���� ���(������ �˷��ְ� �����ϱ⤿)
		if(args.length<2) {
			System.out.println("[Usage]java MethodTest �Ǽ�1 �Ǽ�2");
			System.exit(1);//return;
		}
		
		
		System.out.println(Double.parseDouble (args[0]) + Double.parseDouble (args[1]));
		//���ڿ��� ���ڷ� ��ȯ�ϱ�
		//Wrapper Ŭ����: Integer, Double, Byte,
		//���� �ڷ����� ��ü�� ������ Ŭ����
		//Integer.parseInt("3")
		//Double.parseDouble("3.15")
		
		System.out.println(sum(2,3));
		System.out.println(division(4,5));
		System.out.println(absolute(-9.3));
		big(6.4, 0.2);
		
	}
	//������ �Է°��� ���� ����ϴ� �޼ҵ�
	static int sum(int a, int b){
		return a+b;
	}
	/*
	- ���� 2���� �Է� �޾� ���� ���(�Ǽ�)�� ��ȯ�ϴ� division() �޼ҵ�
	- �Ǽ� 1���� �Է� �޾� �� ���밪�� ��ȯ�ϴ� absolute() �޼ҵ�
	- �Ǽ� 2���� �Է� �޾� �� ���� �߿��� ū ���� ����ϴ� big() �޼ҵ�
	*/
	static double division(int a, int b){
		return (double)a/b;
	}
	
	static double absolute(double d){
		double rslt = d>0? d: -d;
		return rslt;
		
		/*if(d>0) return d;
		else return -d;
		*/
	}
	
	static void big(double a, double b){
		System.out.printf("%.2f�� %.2f �� ū ���� %.2f�Դϴ�.\n", a, b, a>b?a:b);
		return;
	}
	
	
	
}

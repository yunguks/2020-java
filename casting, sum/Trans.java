import java.lang.Integer;

class Trans{
	public static void main(String [] args){
		String [] a = {"103", "34", "��"};
		transint(a);
	}	
	static void transint(String [] a){
		int [] b = new int[a.length];
		try{
			for(int i = 0; i < a.length; i++){
				b[i] = Integer.parseInt(a[i]);
				System.out.printf("%d ",b[i]);
			}
		}catch(java.lang.NumberFormatException ne){
			System.out.println("���ڿ��� ������ ��ȯ�ϴ� �������� ���ܹ߻�");
		}
	}
}
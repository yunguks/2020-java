
class Trans3{
	public static void main(String [] args){
		String [] a = {"103", "34", "��"};
		transint2(a);

	}
	
	static void transint2(String [] a){
		int [] b = new int[a.length];
		int k=1;
		try{
			for(int i=0;i<a.length;i++){
				b[i] = Integer.parseInt(a[i]);
				System.out.printf("%d ",b[i]);
				k++;
			}
		}catch(java.lang.NumberFormatException nfe){
				System.out.printf("%d��° ���ڸ� ���ڷ� ��ȯ�ϴ� �������� ���� �߻�",k);
		}
	}
}
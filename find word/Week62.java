import java.util.Scanner;

class Week62{
	public static void main(String [] args){
		if(args.length<1) {
			System.out.println("[����]java Week62 ����1 ����2 ... �Է��Ͻÿ�.");
			System.exit(1);
		}
		
		int [] arr = new int[args.length];
		int tmp;
		
		
		for(int i=0; i<arr.length;i++)
			arr[i] = Integer.parseInt(args[i]);
		
		System.out.println("Ŀ�ǵ������ ���ڵ� �� ¦��: ");
		
		for(int i=0; i<arr.length;i++)
			if(arr[i]%2==0) System.out.printf("%d ",arr[i]);		
			
		System.out.println();
		
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1; j<arr.length;j++){
				if(arr[i] > arr[j]){
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) System.out.printf("%d ",arr[i]);
		
	}
}

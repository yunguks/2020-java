import java.lang.Math;

class MH1{
	public static void main (String [] args){
		int [] arr = new int[6];
		
		System.out.println("비밀번호:");
		
		for(int i=0;i<6;i++){
			arr[i]=(int)(Math.random()*10);
			System.out.printf("%d",arr[i]);
		}
	}
}

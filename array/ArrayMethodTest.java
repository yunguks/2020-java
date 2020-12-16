import java.util.Scanner;
import java.lang.Math;

public class ArrayMethodTest{
   public static void main(String [] args){
      double [] arr;
      int size;
      Scanner s = new Scanner(System.in);
      
      System.out.print("배열 성분 개수: ");
      size = s.nextInt();
      arr = new double[size];
      
      initArr(arr);//배열 초기화
      System.out.println("배열 성분: ");
      printArr(arr);//배열 성분 출력
	  System.out.printf("배열 성분의 합: %.2f\n",sumArr(arr));
	  System.out.printf("배열 성분의 최대값: %.2f\n",maxArr(arr));
	  System.out.printf("최댓값의 인덱스: %d\n",indexMaxArr(arr));
	  shuffleArr(arr);
	  System.out.println("재배열 성분: ");
	  printArr(arr);
	  rotateR1(arr);
	  System.out.println("오른쪽으로 한 칸 로테이션 후 배열 성분: ");
	  printArr(arr);
	  rotateR2(arr,213);
	  System.out.println("오른쪽으로 213 칸 로테이션 후 배열 성분: ");
	  printArr(arr);
   }
   
   static void initArr(double [] arr){
      for(int i=0; i<arr.length; i++)
         arr[i] = Math.random()*10;
      return;
   }
   
   static void printArr(double [] arr){
      for(double x : arr)
         System.out.printf("%.2f\t", x);
      System.out.println();
      return;
   }
   
   static double sumArr(double [] arr){
	   double sum = 0;
	   for(double x : arr){
		   sum += x;
	   }
	   return sum;
   }
   
   static double maxArr(double [] arr){
	   double max = arr[0];
	   for(int i=0; i<arr.length; i++)
		if(max<arr[i]) max=arr[i];
	   return max;
   }
   
	 static int indexMaxArr(double [] arr){
	   double max = arr[0];
	   int index=0;
	   for(int i=0; i<arr.length; i++)
		if(max<arr[i]) {
			max=arr[i];
			index = i+1;
		}
	   return index; 
   }
   
	static void shuffleArr(double [] arr){
	   int r;
	   double tmp;
	   
	   for(int i=0; i<arr.length; i++){
		r = (int)(Math.random()*arr.length);
		tmp = arr[i];
		arr[i] = arr[r];
		arr[r] = tmp;
	   }
   }
   
	static void rotateR1(double [] arr){
	   double tmp = arr[arr.length-1];
	   
	   for(int i=arr.length-1; i>0; i--)
		arr[i] = arr[i-1];
	
		arr[0] = tmp;
	
   }
   
	static void rotateR2(double [] arr,int n){
	  
	  for(int i=0; i<n%arr.length; i++)
	  rotateR1(arr);
	
   }
	   
}
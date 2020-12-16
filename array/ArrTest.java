import java.util.Scanner;

class ArrTest{
	public static void main(String [] args){
		double [] scores2;
		int num, index;
		Scanner s = new Scanner(System.in);
		
		System.out.print("학생수: ");
		num = s.nextInt();
	
		scores2 = new double[num];
		
		for(int i=0; i<scores2.length ; i++)
		{
			System.out.print(i+1+"번 학생 점수: ");
			scores2[i] = s.nextDouble();
		}
		while(true){
			System.out.print("몇 번 학생? ");
			index = s.nextInt();
			if(index>=1 && index<=scores2.length) break;
			System.out.printf("[입력오류]1번부터 %d번까지의 학생만 존재합니다.\n",scores2.length);
			
		}
		System.out.printf("%d번 학생의 점수는 %.2f입니다.\n",index, scores2[index-1]);
		
		for(double x : dArr){
			System.out.println(x);
		}
	}
} 
		/*for-each문
		for(자료형 변수명 : 배열명){    - 하나씩 변수에 저장되고 반복한후 다음 변수를 저장한다
		반복할 내용 } 					모든 성분 출력할 때 유용함
		*/
		
		/* int [] arr = new int[4]
		int [] < 정수를 저장하는 배열이다
		   = new int[4] 정수 4개를 저장하는 배열이다 그공간의 주소를 arr에 저장
		
		double [] dArr = {2.3, 4.5, 3, 10.3, 10.5};
		
		for(int i=0; i<dArr.length; i++)
		System.out.print(dArr[i]+" ");
		//배열의 길이 > 배열명.length      필드로 접근하기 때문에 ()x
		//문자열의 길이 > 문자열.length()
		*/

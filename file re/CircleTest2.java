import java.io.*;
import java.util.Scanner;

class CircleTest2{
	public static void main(String [] args) throws Exception{
		if(args.length!=1){
			System.out.println("[사용법]java CircleTest2 학번.java");
			System.exit(1);
		}
		int r;
		double a;
		
		File f1 = new File(args[0]);
		File f2 = new File("원의 반지름과 넓이.java");
		if(f1.exists()==true){
			System.out.printf("\"%s\" 파일이 이미 존재합니다. 새로운 파일명을 입력해주세요.",f1.getName());
		}
		
		Scanner s = new Scanner(f2);
		PrintWriter pw = new PrintWriter(f1);
		
		while(s.hasNext()){
			int i=1;
			r = s.nextInt();
			a = s.nextDouble();
			if(a==r*r*3.14){
				System.out.printf("%d번째 원의 넓이는 제대로 구해졌습니다. 반지름(%d), 넓이(%.2f)\n",i,r,a);
				pw.printf("%d번째 원의 넓이는 제대로 구해졌습니다. 반지름(%d), 넓이(%.2f)\n",i,r,a);
			}
			else {
				System.out.printf("%d번째 원의 넓이는 잘못 구했습니다. 반지름이 %d일 경우 넓이는 %.2f가 아니라 %.2f 입니다.\n",i,r,a,r*r*3.14);
				pw.printf("%d번째 원의 넓이는 잘못 구했습니다. 반지름이 %d일 경우 넓이는 %.2f가 아니라 %.2f 입니다.\n",i,r,a,r*r*3.14);
			}
		}
		s.close();
		pw.close();
		
	}
}
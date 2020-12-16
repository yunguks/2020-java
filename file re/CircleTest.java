import java.io.*;
import java.util.Scanner;

class CircleTest{
	public static void main(String [] args) throws FileNotFoundException{
		if(args.length!=1){
			System.out.println("[사용법]java CircleTest 결과가저장될파일명");
			System.exit(1);
		}
		
		File f1 = new File("원의 반지름과 넓이.java");
		File f2 = new File(args[0]);
		
		if(f1.exists()==false){
			System.out.printf("\"%s\" 파일이 존재하지 않습니다. 확인해주세요.\n", f1.getName());
			System.exit(1);				
		}else if(f2.exists()==true){
			System.out.printf("\"%s\" 파일이 이미 존재합니다. 새로운 파일명을 입력해주세요.\n", f2.getName());
			System.exit(1);				
		}
		int r,i=0;
		double c;
		
		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);
		while(s.hasNext()==true){
			i++;
			r = s.nextInt();
			c = s.nextDouble();
			if(c==(r*r*3.14)){
				pw.printf("%d번째 원의 넓이는 제대로 구해졌습니다: 반지름(%d), 넓이(%.2f)\n",i,r,c);
			}
			else pw.printf("%d번째 원의 넓이는 잘못 구했습니다: 반지름이 %d일 경우 넓이는 %.2f가 아니라 %.2f입니다..\n",i,r,c,r*r*3.14);
		}
		s.close();
		pw.close();
		System.out.println("소스파일이 위치한 폴더에 결과 파일이 생성되었습니다.확인해보세요.");
	}
	
}
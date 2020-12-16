/*단어 교체 프로그램
java ReplaceFile 원본파일명 대체본파일명 구단어 신단어- 커멘드 라인 

java CopyFile abc.txt copy.txt word1 word2
커맨드라인 인자가 4개가 아니라면 프로그램 종료
원본에서 구단어가 검색되면 신단어로 교체하여 대체본에 작성하기 
원본이 존재하지 않는다면 사용법 알리고 프로그램 종료
대체본 파일이 이미 존재한다면 이미 파일이 존재한다고 알리고 종료
단어 대체 후 콘솔창에 단어대체완료라고 알리기
*/

import java.io.*;
import java.util.Scanner;

class ReplaceFile{
	public static void main(String [] args) throws Exception{
		if(args.length!=4){
			System.out.println("[사용법]java ReplaceFile 원본파일명 대체본파일명 구단어 신단어");
			System.exit(1);
		}
		String s1=args[2];
		String s2=args[3];
		File f1 = new File(args[0]);
		File f2 = new File(args[1]);
		
		if(f1.exists()==false){
			System.out.println("원본파일이 존재하지 않습니다.");
			System.exit(1);
		}else if(f2.exists()==true){
			System.out.printf("%s가 이미 존재합니다.",f2.getName());
		}
		
		Scanner s = new Scanner(f1);
		PrintWriter pw = new PrintWriter(f2);

		while(s.hasNext()==true){
			pw.printf("%s\r\n",s.nextLine().replaceAll(s1,s2));
		}
	
		s.close();
		pw.close();
		System.out.printf("[단어교체완료]현재 폴더에 %s파일을 확인해주세요. \n", f2.getName());
		
	}
}
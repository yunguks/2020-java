/*파일 복사 프로그램
java CopyFile 원본파일명 복사본파일명 - 커멘드 라인 

java CopyFile abc.txt copy.txt
커맨드라인 인자가 2개가 아니라면 프로그램 종료
원본을 복사본에 복사하기 
원본이 존재하지 않는다면 사용법 알리고 프로그램 종료
복사본 파일이 이미 존재한다면 이미 파일이 존재한다고 알리고 종료
파일 복사 후 콘솔창에 파일 복사완료
*/
import java.io.*;
import java.util.Scanner;

class CopyFile{
	public static void main(String [] args){
		if(args.length!=2){
			System.out.println("[사용법]java CopyFile 원본파일명 복사본파일명");
			return;
		}
		File [] f = {new File(args[0]), new File(args[1])};

		if(f[0].exists()==false){
			System.out.print("원본이 존재하지 않습니다.\n[사용법]java CopyFile 원본파일명 복사본파일명");
			System.exit(1);
		}
		else if(f[1].exists()==true){
			System.out.print("복사본이 존재합니다.\n[사용법]java CopyFile 원본파일명 복사본파일명");
			System.exit(1);
		}
		
		Scanner s = null;
		PrintWriter pw = null;
		try{
			s = new Scanner(f[0]);
			pw = new PrintWriter(f[1]);
			while(s.hasNext()==true){
				//System.out.println(s.nextLine());
				pw.printf("%s\r\n",s.nextLine());
			}
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}finally{
			s.close();
			pw.close();
			System.out.printf("[복사완료]현재 폴더에 %s파일을 확인해주세요. \n", f[1].getName());
		}
		
		

	}
}
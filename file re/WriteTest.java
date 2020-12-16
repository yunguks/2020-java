import java.util.Scanner;
import java.io.*;

class WriteTest{
	public static void main(String [] args){
		//사용자에게 이름과 나이를 입력받아 그내을 "Man. java"파일에 쓰기
		Scanner s = new Scanner(System.in);
		File f = new File("Man.java");
		String name;
		int age;
		PrintWriter pw = null;//finally에서 pw가 초기화가 안되 컴파일 오류
		
		System.out.println("존재? "+f.exists());
		
		try{
			pw = new PrintWriter(f);//파일을 작성
			System.out.println("존재? "+f.exists());
			for(int i=0; i<3; i++){
				System.out.print("이름: ");
				name = s.nextLine();
				System.out.print("나이: ");
				age = s.nextInt();
				s.nextLine();//nextLine이 엔터도 받아서 버퍼로 비우는 역할
				
				pw.printf("%s %d\r\n",name,age);//pw에 프린트한다. 엔터 = \r\n
				//pw.close(); //있떤 내용이 f로 넘어간다. 자원정리
			}
		}catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}finally{
			pw.close(); //pw가 try 안에 잇기떄문에 pw선언 위에서
		}
		System.out.printf("현재 폴더에 %s파일을 확인해주세요. \n", f.getName());
	}
}
import java.io.*;

class FileTest{
	public static void main(String [] args){
		File hw13 = new File("ABC"+File.separator+"과제13.pdf"); 
		//="ABC\\과제13.pdf" 윈도우와 리눅스에서 둘다 사용하기 위해
		//상대 경로: 현재폴더(class 파일이 위치하는 곳)부터 시작
		File abc = new File("C:\\Users\\Lee\\Desktop\\수업\\abc.txt");//절대 경로
		//제어문자 \~ \n \t \b \r 이다     \자체를 하려면 \\ 을 해야한다.
		File [] files = {new File("All.class"), new File("ABC"), new File("week12.pdf"), new File("FileTest.java")};
		
		for(File f:files){
			System.out.println(f.getName());
			System.out.println(f.exists());
			System.out.println(f.isFile());
			System.out.println(f.getAbsolutePath());
			System.out.println(new java.util.Date(f.lastModified())); //마지막 수정날짜 > 데이트 클래스
		}
		
		
		System.out.println("존재? "+hw13.exists());//존재하면 true
		System.out.println("존재? "+abc.exists());//존재 x false
		System.out.println("파일이름 : "+abc.getName()); //파일이름 abc.txt 
		System.out.println("파일? "+abc.isFile()); //파일이냐 폴더냐 ture
		System.out.println("폴더? "+abc.isDirectory());//디렉토리냐 파일이냐 false 
		System.out.println("절대경로? "+abc.isAbsolute()); // 절대경로 true or false
		System.out.println("파일크기 : "+abc.length()); //파일 크기 반환
		System.out.println("읽기 여부? "+abc.canRead()); //읽기 여부
		System.out.println("쓰기 여부? "+abc.canWrite()); //쓰기 여부
		
		System.out.println(hw13.isAbsolute());
		System.out.println("절대경로 : "+hw13.getAbsolutePath()); //절대경로 표시
	}
}
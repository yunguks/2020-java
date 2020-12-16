import java.lang.Math;

class 국어 extends 과목{
	국어(){
		super(); // 디폴트 생성자를 불러오기?문에 생략해도 무방
	}
}
class 영어 extends 과목{
	영어(){
		super();
	}
}
class 수학 extends 과목{
	수학(){
		super();
	}
}
class 과학 extends 과목{
	과학(){
		super();
	}
}
class 과목{
	private int score;
	과목(){
		setScore();
	}
	/*
	과목(){
		score =(int)
	}
	과목(int score){
		if(score>=0 && score<=100)
			this.score =score;
		else 
			this.score((int)(Math.random()*101));
	}*/
	int getScore(){
		return score;
	}
	int setScore(){
		score = (int)(Math.random()*101);
		return score;
	} 
}

class Student{
	void report(과목 [] book){
		for(int i =0; i< book.length; i++){
			System.out.printf("%s : %d \n",book[i].getClass().getName(),book[i].getScore());
		}
	}
}

class ScoreTest{
	public static void main(String [] args){
		Student s = new Student();
		과목 [] book = {new 국어(), new 영어(), new 수학(), new 과학()};
		s.report(book);
		
	}
}
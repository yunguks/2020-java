import java.lang.Math;

class ���� extends ����{
	����(){
		super(); // ����Ʈ �����ڸ� �ҷ�����?���� �����ص� ����
	}
}
class ���� extends ����{
	����(){
		super();
	}
}
class ���� extends ����{
	����(){
		super();
	}
}
class ���� extends ����{
	����(){
		super();
	}
}
class ����{
	private int score;
	����(){
		setScore();
	}
	/*
	����(){
		score =(int)
	}
	����(int score){
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
	void report(���� [] book){
		for(int i =0; i< book.length; i++){
			System.out.printf("%s : %d \n",book[i].getClass().getName(),book[i].getScore());
		}
	}
}

class ScoreTest{
	public static void main(String [] args){
		Student s = new Student();
		���� [] book = {new ����(), new ����(), new ����(), new ����()};
		s.report(book);
		
	}
}
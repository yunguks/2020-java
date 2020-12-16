import java.lang.Math;

class Consi{
	public static void main(String [] args){
	 Korean2 k = new Korean2();
	 English2 e = new English2();
	 Math2 m = new Math2();
	 
	 k.report();
	 e.report();
	 m.report();
	 
	}
}

class Kin{
	private int score;
	Kin(){
		this.score = (int)(Math.random()*101);	
	}
	
	Kin(int score){
		this.score = score;

	}
	
	int getScore(){
		return score;
	}
	
	void report(){
		getScore();
		if(score>0 && score<=100) System.out.printf("%s: %d\n",getClass().getName(),getScore());
		else System.out.println("점수를 다시 입력하여주세요.");
	}
	
}

class Korean2 extends Kin{
	Korean2(){
		super();
	}
	
	Korean2(int a){
		super(a);
	}
}

class English2 extends Kin{
	English2(){
		super();
	}
	
	English2(int a){
		super(a);
	}
	
}

class Math2 extends Kin{
	Math2(){
		super();
	}
	Math2(int a){
		super(a);
	}
}
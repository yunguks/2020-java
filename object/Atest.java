import java.lang.Math;

class Figure1{
	private double l,s;
	
	Figure1(){}
	Figure1(double l, double s){
		this.l = l;
		this.s = s;
	}
	
	public String toString(){
		return String.format("이 도형은 %s이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n",getClass().getName(),l,s);
	}
	
}

class Circle1 extends Figure1{
	private double r;
	
	Circle1(){
	}
	
	Circle1(double r){
		super(r*2*Math.PI,r*r*Math.PI);
		this.r = r;
	}
	
	public String toString(){
		return super.toString()+String.format("또, 반지름은 %.1f입니다.\n",r);
	}
	
	public boolean equals(Circle1 c1){
		if(this.r == c1.r) return true;
		else return false;
	}
	
}

class Triangle1 extends Figure1{
	private double h,a;
	
	Triangle1(){}
	Triangle1(double a){
		super(3*a,a*a*Math.sqrt(3)/4);
		this.a = a;
		h = a*(1/2)*Math.sqrt(3);
		
	}
	
	public String toString(){
		return super.toString()+String.format("이 삼각형의 한변의 길이는 %.2f이고, 높이는 %.2f입니다.\n",a,h);
	}
	
}

class Atest{
	public static void main(String [] args){
		Circle1 c1 = new Circle1(3);
		Circle1 c2 = new Circle1(1);
		Triangle1 t1 = new Triangle1(3);
		
		System.out.println(t1.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		if(c1.equals(c2)) System.out.println("위의 두 원은 합동입니다.");
		else System.out.println("위의 두 원은 합동이 아닙니다.");
	}
}
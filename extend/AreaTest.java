import java.lang.Math;

class Figure{//계산
	private double length, area;

	Figure(double r){
		length = 2*r;
		area = r*Math.PI;
	}
	Figure(int k){
		length = 3*k;
		area = (k*k*Math.sqrt(3))/2;
	}
	
	double getlength(){
		return length;
	}
	double getArea(){
		return area;
	}
	
	public String toString(){
		return String.format("둘레는 %.2f, 넓이는 %.2f입니다",length,area);
	}
}

class Circle extends Figure{
	double r;
	
	Circle(double r){
		super(r);
		this.r = r;
	}
	public String toString(){
		return "이 도형은 Circle이고,"+ super.toString()+" 또, 반지름은 "+r+"입니다.";
	}
	public boolean equals(Circle c1){
		if(this.r == c1.r) return true;
		else return false;
	}
}

class EquilateralTriangle extends Figure{//정삼각형
	int k;
	double h;
	
	EquilateralTriangle(int k){
		super(k);
		this.k = k;
		h = (k*Math.sqrt(3))/2;
	}
	
	public String toString(){
		return String.format("이 도형은 EquilateralTriangle 이고, 둘레는 %.2f, 넓이는 %.2f입니다.\n이 삼각형의 한변의 길이는 %d이고, 높이는 %.2f입니다.",getlength(), getArea(),k,h);
	}
}

class AreaTest{
	public static void main(String [] args){
		EquilateralTriangle e = new EquilateralTriangle(3);
		Circle c1 = new Circle(3);
		Circle c2 = new Circle(1);
		System.out.println(e.toString());
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		if(c1.equals(c2)==true) System.out.println("이 도형은 합동입니다.");
		else System.out.println("이 도형은 합동이 아닙니다.");
	}
	
	
}
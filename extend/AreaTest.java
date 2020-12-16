import java.lang.Math;

class Figure{//���
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
		return String.format("�ѷ��� %.2f, ���̴� %.2f�Դϴ�",length,area);
	}
}

class Circle extends Figure{
	double r;
	
	Circle(double r){
		super(r);
		this.r = r;
	}
	public String toString(){
		return "�� ������ Circle�̰�,"+ super.toString()+" ��, �������� "+r+"�Դϴ�.";
	}
	public boolean equals(Circle c1){
		if(this.r == c1.r) return true;
		else return false;
	}
}

class EquilateralTriangle extends Figure{//���ﰢ��
	int k;
	double h;
	
	EquilateralTriangle(int k){
		super(k);
		this.k = k;
		h = (k*Math.sqrt(3))/2;
	}
	
	public String toString(){
		return String.format("�� ������ EquilateralTriangle �̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n�� �ﰢ���� �Ѻ��� ���̴� %d�̰�, ���̴� %.2f�Դϴ�.",getlength(), getArea(),k,h);
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
		if(c1.equals(c2)==true) System.out.println("�� ������ �յ��Դϴ�.");
		else System.out.println("�� ������ �յ��� �ƴմϴ�.");
	}
	
	
}
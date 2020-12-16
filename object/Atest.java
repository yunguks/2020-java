import java.lang.Math;

class Figure1{
	private double l,s;
	
	Figure1(){}
	Figure1(double l, double s){
		this.l = l;
		this.s = s;
	}
	
	public String toString(){
		return String.format("�� ������ %s�̰�, �ѷ��� %.2f, ���̴� %.2f�Դϴ�.\n",getClass().getName(),l,s);
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
		return super.toString()+String.format("��, �������� %.1f�Դϴ�.\n",r);
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
		return super.toString()+String.format("�� �ﰢ���� �Ѻ��� ���̴� %.2f�̰�, ���̴� %.2f�Դϴ�.\n",a,h);
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
		if(c1.equals(c2)) System.out.println("���� �� ���� �յ��Դϴ�.");
		else System.out.println("���� �� ���� �յ��� �ƴմϴ�.");
	}
}
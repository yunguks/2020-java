/*�� Ŭ����
- �Դ´� : eat(): �Ű������� ���� ������ �Դ´ٴ� ������ ���

�ܹ��� Ŭ����
���� Ŭ����
���� Ŭ����
���̽�ũ�� Ŭ����

�׽�Ʈ Ŭ����
- �� , ���ĵ� ������ ���� ������ ������ �Դ� ���� �ùķ��̼� �� ��

�������� ����
1. �ߺ����ǰ� �ʿ� ����. �޼ҵ��� �Ű������� ����Ŭ������ �ڷ������� �θ� ���� Ŭ������ ��ü�� ��� ó�� ���� 
*/
class Food{}
class I{
	void eat(Object o) throws NotFoodException{// ��ĳ���� ������ ������Ʈ�� ����
		//���� �����̶��
		if(o instanceof Food)
		System.out.println(o.getClass().getName()+"��(��) �Խ��ϴ�.");
		//�ƴ϶�� �峭ġ�� ������
		else {
			System.out.println(o.getClass().getName()+"�� ������ �ƴ϶� ���� �ʰڽ��ϴ�.");
			throw new NotFoodException();
		}
	}
	
	/*void eat(Burger b){
		System.out.println("�ܹ��Ÿ� �Խ��ϴ�.");
	}
	void eat(Pizza p){
		System.out.println("���ڸ� �Խ��ϴ�.");
	}
	void eat(Bingsu s){
		System.out.println("������ �Խ��ϴ�.");
	}
	void eat(IceCream c){
		System.out.println("���̽�ũ���� �Խ��ϴ�.");
	}*/
}
class NotFoodException extends Exception{
	NotFoodException(){
		super("���ľƴ� ����");
	}
}
/*eat()�޼ҵ�� ���ڰ� �����̶�� "**�� �Խ��ϴ�" �޽����� ����ϰ�, ���ڰ� ������ �ƴ϶�� 
NotFoodException�� �߻���Ű��, �� ���ܸ� ���� ó������ �ʰ� �ڽ��� ȣ���� ������ ������.*/
class Stone{}
class Burger extends Food{}
class Pizza extends Food{}
class Bingsu extends Food{}
class IceCream extends Food{}

class EatTest{
	public static void main(String [] args){
		try{ // ���ܳ��ö� ���ߴ� try , ���������� ���شٸ� stone�� ���͵� ������ ����.
			I i = new I();
			Burger b = new Burger();
			i.eat(b);
			Pizza p = new Pizza();
			i.eat(p);
			i.eat(new IceCream());
			i.eat(new Bingsu());
			i.eat(new Stone());
		}catch(NotFoodException nfe){
			System.out.println("������ ���� �ƴ� ���� ����������.");
		}
		/*
		Object b = new Burger();
		Object p = new Pizza();
		*/
	}
}

/*
������ Ŭ���� 
 - ������ �� ���� : conduct() : �Ű������� ���� �����ڵ鿡�� ���ָ� �Ѵ�.
�ǾƴϽ�Ʈ Ŭ����
 - play() : "�ǾƳ븦 �����մϴ�" ������ ���
 ÿ����Ʈ Ŭ����
 - play() : "ÿ�θ� �����մϴ�" ������ ���
 ���̿ø��Ͻ�Ʈ Ŭ����
 - play() : "���̿ø��� �����մϴ�" ������ ���
 
 �׽�Ʈ Ŭ����
  - �����ڵ�(�ǾƴϽ�Ʈ, ç����Ʈ, ���̿ø��Ͻ�Ʈ) ������ ����
  - ������ ���� �� ������ ������ �����ڵ鿡�� �����ϴ� ���� �ùķ��̼�
  
 �������� ����
  2. �ڽ�Ŭ������ ��ü���� �θ�Ŭ���� �ڷ����� �迭�� ���� �� �ִ�.
     � ��ü�� ���� �� �ִ� �迭�� �ڷ����� Object �̴�
 */
class PlayTest{
	public static void main(String [] args){
		/*������ p1 = new �ǾƴϽ�Ʈ();
		������ p2 = new �ǾƴϽ�Ʈ();
		������ p3 = new �ǾƴϽ�Ʈ();
		������ p4 = new �ǾƴϽ�Ʈ();
		������ c1 = new ÿ����Ʈ();
		������ c2 = new ÿ����Ʈ();
		������ c2 = new ÿ����Ʈ();
		������ v1 = new ���̿ø��Ͻ�Ʈ();
		������ v2 = new ���̿ø��Ͻ�Ʈ();
		������ v3 = new ���̿ø��Ͻ�Ʈ();
		������ v4 = new ���̿ø��Ͻ�Ʈ();*/
		//�迭�� �ڷ����� ���� �ڷ���� ����
		������ [] players = {new ���̿ø��Ͻ�Ʈ(), new �ǾƴϽ�Ʈ(), new �ǾƴϽ�Ʈ(), new �ǾƴϽ�Ʈ(), new ���̿ø��Ͻ�Ʈ(), new ç����Ʈ(), new ç����Ʈ(),
		new ���̿ø��Ͻ�Ʈ(), new �ǾƴϽ�Ʈ(), new ���̿ø��Ͻ�Ʈ(), new ç����Ʈ()};	
		������ c = new ������();
		//conduct �����ض� ��ο��� �� �� ���� 
		c.conduct(players);
	}
}
class ������{
	void play(){
		System.out.println("�����մϴ�.");
	}
}
class ������{
	void conduct(������ [] players){
		for(int i = 0; i<players.length; i ++){
			players[i].play();
		}
	}
}
class �ǾƴϽ�Ʈ extends ������{
	void play(){
		System.out.print("�ǾƳ븦 ");
		super.play();
	}
}
class ç����Ʈ extends ������{
	void play(){
		System.out.print("ç�θ� ");
		super.play();
	}
}
class ���̿ø��Ͻ�Ʈ extends ������{
	void play(){
		System.out.print("���̿ø��� ");
		super.play();
	}
}
package Interface;

public class Main01 {
	public static void main(String[] args) {
		//캐릭터와 몬스터의 객체 만들기
		Character c = new Character("주인공");
		c.walk();
		c.run();
		c.attack();
		c.shield();
		c.jump();
		c.pickUp();
		
		Monster m1 = new Monster("슬라임");
		Monster m2 = new Monster("오크");
		m1.walk();
		m1.run();
		m1.attack();
		m1.shield();
		m1.jump();

		m2.walk();
		m2.run();
		m2.attack();
		m2.shield();
		m2.jump();
		
	}
}

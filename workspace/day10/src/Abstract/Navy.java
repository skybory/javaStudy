package Abstract;

/*
 * 1. Unit class 상속
 * 2. 	attack() 	-> 이름 (Unit 생성자) + " >> 해상공격"
 * 		move()		-> 이름 (Unit 생성자) + " >> 해상이동"
 * 
 */


public class Navy extends Unit {

	public Navy(String name) {
		super(name);
	}

	public void attack() {
		System.out.println(this.getName()+" >> 해상공격" );
		
	}
	
	public void move() {
		System.out.println(this.getName()+" >> 해상이동" );
	}
}

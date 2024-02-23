package Abstract;
/*
 * 1. Unit class 상속
 * 2. 	attack() 	-> 이름 (Unit 생성자) + " >> 육상공격"
 * 		move()		-> 이름 (Unit 생성자) + " >> 육상이동"
 * 	
 * 
 * 
 */
public class Army extends Unit {

	public Army(String name) {
		super(name);
	}

	public void attack() {
		System.out.println(this.getName()+" >> 육상공격" );
		
	}
	
	public void move() {
		System.out.println(this.getName()+" >> 육상이동" );
	}
	
	
	
}

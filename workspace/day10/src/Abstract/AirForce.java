package Abstract;


/*
 * 1. Unit class 상속
 * 2. 	attack() 	-> 이름 (Unit 생성자) + " >> 공중공격"
 * 		move()		-> 이름 (Unit 생성자) + " >> 공중이동"
 * 
 */
public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}

	public void attack() {
		System.out.println(this.getName()+" >> 공중공격" );
		
	}
	
	public void move() {
		System.out.println(this.getName()+" >> 공중이동" );
	}
	
}

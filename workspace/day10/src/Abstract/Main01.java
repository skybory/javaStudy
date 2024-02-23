package Abstract;

public class Main01 {

	public static void main(String[] args) {

		/*
		 * Army , Navy, AirForce 객체 만들어서
		 * 각각의 move(), attack() 실행
		 * 45분까지
		 */
		
		Army ar = new Army("육군");
		Navy nv = new Navy("해군");
		AirForce af = new AirForce("공군");
		ar.attack();
		ar.move();
		
		nv.attack();
		nv.move();
		
		af.attack();
		af.move();
		
	}

}

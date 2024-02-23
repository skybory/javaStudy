package boxing;

public class Navy extends Unit {
	// 1. Unit 상속
	// 2. attack() override 
	//		-> 군대이름 출력 + >> 어뢰 발사!!
	//		-> 군대이름 출력 + >> 지상 상륙
	// 3. nucleus()
	// 		-> 군대이름 출력 + >> 핵미사일
	
	public Navy(String name) {
		super(name);
	}
	 public void attack() {
		super.attack();			//부모의 attack 메서드 출력
		System.out.println(super.getName() +" >> 어뢰 발사!!");
		System.out.println(super.getName() +" >> 지상 상륙");
	}

	 public void nucleus() {
		 System.out.println(super.getName() + " >> 핵미사일");
	 }
}

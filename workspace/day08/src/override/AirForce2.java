package override;

public class AirForce2 extends Unit2 {
		// 1. Unit 상속
		// 2. attack() override 
		//		-> 군대이름 출력 + >> 이륙
		//		-> 군대이름 출력 + >> 공중공격 실행
		// 3. bombing()
		// 		-> 군대이름 출력 + >> 폭격
	public AirForce2(String name) {
		super(name);
	}
	
	public void attack() {
		super.attack();
		System.out.println(super.getName() + " >> 이륙");
		System.out.println(super.getName() + " >> 공중공격 실행");
	}
	
	public void bombing() {
		System.out.println(super.getName() + " >> 폭격");
	}
}

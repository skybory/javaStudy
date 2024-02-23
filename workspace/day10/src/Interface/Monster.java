package Interface;

public class Monster implements Unit,Move,Fight {

	@Override
	public void attack() {
		System.out.println("몬스터고 공격합니다.");
	}

	@Override
	public void shield() {
		System.out.println("몬스터고 방어합니다.");
	}

	@Override
	public void walk() {
		System.out.println("몬스터가 걸어갑니다.");
	}
	@Override
	public void jump() {
		System.out.println("몬스터가 점프합니다.");
	}
	@Override
	public void run() {
		System.out.println("몬스터가 뛰어갑니다.");
	}

}

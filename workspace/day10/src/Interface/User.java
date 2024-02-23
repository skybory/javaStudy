package Interface;

/*
 * 인터페이스 상속은 implements 키워드를 사용한다.
 * 인터페이스도 추상화를 구현하고 있기 때문에
 * 인터페이스를 상속받는 클래스는 인터페이스내의 모든 메서드들을
 * 반드시 재정의해야한다.
 * -인터페이스 다중상속은 콤마를 통해 이어받을 수 있음.
 * 
 * main 클래스 1개
 * 인터페이스 동작,싸움,이동
 * 기본 클래스 주인공,몬스터
 * 
 */
//주인공 클래스
public class User implements Unit,Move,Fight,Action{

	@Override
	public void attack() {
		System.out.println("주인공이 공격합니다");
	}

	@Override
	public void shield() {
		System.out.println("주인공이 방어합니다");
	}

	@Override
	public void walk() {
		System.out.println("주인공이 걸어갑니다");
	}
	@Override
	public void jump() {
		System.out.println("주인공이 점프합니다");
	}
	@Override
	public void run() {
		System.out.println("주인공이 뛰어갑니다");
	}
	@Override
	public void pickUp() {
	System.out.println(("아이템을 획득했습니다"));
	}
}

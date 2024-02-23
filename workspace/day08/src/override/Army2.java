package override;

public class Army2 extends Unit2 {
	
	public Army2 (String name) {	// 부모 클래스인 Unit2가 String 파라미터를 필요로 하기 때문에 생산자 호출.
		super(name);				// super 지시자를 통해 부모 클래스의 name 을 받아옴.
	}
	
	//override
	public void attack() {
		super.attack(); 		// 부모 클래스의 attack 기능 인쇄
		System.out.println( super.getName() + " >> 지상공격"); 		// super 기능은 선택적(없어도 됨). 가독성을 위해 씀
	}
	
	public void tank() {
		System.out.println(super.getName() + " >> 탱크공격");
	}

}

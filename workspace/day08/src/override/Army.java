package override;

public class Army extends Unit {
	
	//override
	@Override
	public void attack() {
		super.attack(); 		// 부모 클래스의 attack 기능 인쇄
		System.out.println( super.getName() + " >> 지상공격"); 		// super 기능은 선택적(없어도 됨). 가독성을 위해 씀
	}
	
	public void tank() {
		System.out.println(super.getName() + " >> 탱크공격");
	}

}

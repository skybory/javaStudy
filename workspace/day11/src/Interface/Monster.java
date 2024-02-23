package Interface;

public class Monster implements Move,Fight {

	private String name;
	
	
	
	public Monster(String name) {
		super();
		this.name = name;
	}

	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void attack() {
		System.out.println(this.name + "이(가) 공격합니다.");
	}

	@Override
	public void shield() {
		System.out.println(this.name + "이(가) 방어합니다.");
	}

	@Override
	public void walk() {
		System.out.println(this.name + "이(가) 걸어갑니다.");
	}
	@Override
	public void jump() {
		System.out.println(this.name + "이(가) 점프합니다.");
	}
	@Override
	public void run() {
		System.out.println(this.name + "이(가) 뛰어갑니다.");
	}

}

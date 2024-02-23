package override;

public class Unit2 {

	private String name;

	public Unit2(String name) {
		super();				//object 클래스를 상속받음, java 의 최상위 클래스. 없어도 됨.
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void attack() {
		System.out.println(this.name + " >> 공격준비");
	}
	
}

package Abstract;

// 육 / 해 / 공군의 공통 기능을 명시하기 위한 부모 클래스

/*
 * 이 클래스를 통한 객체는 생성할 수 없다.(추상클래스의 특징)
 * 반드시 상속의 형태로만 사용되어야 한다.
 * 추상화 되었기 때문에 추상 메서드를 포함할 수 있다.
 * 
 * 
 * 
 */


public abstract class Unit {
	
	private String name; 
	
	
	//파라미터가 있는 생성자
	public Unit(String name) {
		super();
		this.name = name;
	}


	//Getter & Setter
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	//자식클래스에서 재정의할 메서드를 추상으로 명시
	public abstract void attack();
	public abstract void move();
	
	
}

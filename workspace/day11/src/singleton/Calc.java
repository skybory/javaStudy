package singleton;
//계산기
public class Calc {
	// ----------------싱글톤 객체 생성을 위한 준비 -----------------------
	/*
	 * static 이 적용된 자원은 메모리의 고정영역에 생성되기 때문에,
	 * 클래스 자체의 객체나, 그 안에 포함된 멤버변수, 메서드와는
	 * 메모리 상에서 구별된다고 볼 수 있다.
	 * 
	 * 
	 * 그러므로,Calc 클래스 안에 static 형태로
	 * Calc 클래스의 객체를 정의하더라도,코드상의 논리적인
	 * 연관관계를 위해 하나의 파일에서 정의하는 것일 뿐,
	 * 실제로는 Calc 클래스 자체에서 독립된 객체가 되는 것이다. (고정 메모리에 생성됨)
	 * 
	 * Calc 클래스 이외의 여러곳에서 new 연산자를 사용하여 객체 할당(Calc 클래스에 대한 객체 할당을 의미)이 가능하다면,
	 * SingleTon이라는 개념 자체가 성립되지 않으므로, 외부에서 이 객체에 직접적인 접근을
	 * 못하도록 은닉시킨다.	 
	 * 
	 */
	
	private static Calc current;
	
	/*
	 * 은닉된 객체를 할당하거나 메모리에서 삭제하는 기능 추가
	 * - current 객체를 private로 지정하였기 때문에
	 * 객체를 메모리에서 간접적으로 할당하고 삭제하기 위한
	 * 메서드가 필요하다.
	 * - 객체가 할당되지 않은 경우에만 할당하도록 하여
	 * 중복 할당을 방지한다.
	 * 
	 */
											// singleTon 에서 객체를 생성할때는 암묵적으로 getInstance 라는 메서드를 사용.
	public static Calc getInstance() {		// 한번만 만들고, 그 다음엔 꺼내서 쓰면 됨
		if (current == null) {				// current 자리에 객체가 없으면,
			current = new Calc();			// 새로운 객체를 생성해줘라
		}
		return current;						// 둘 중 어떤 경우든, current를 반환한다
	}
	
	/*
	 * 
	 * 객체를 메모리에서 제어하기 위해서는 null을 사용한다.
	 * 
	 * 
	 */
	public static void freeInstance() {
		current = null;
	}
	
	/*
	 * 기본 생성자를 private로 은닉하게 되면
	 * new를 통한 객체 생성이 금지된다.
	 * 
	 */
	private Calc() {
		//기본생성자이기 때문에 super(); 는 없어도 됨.
	}
	
	// ----------------싱글톤 객체 생성을 위한 준비 끝-----------------------
	
	// 이 클래스가 구현해야 하는 기능
	
	public void plus(int x, int y) {
		int z = x + y;
		System.out.println(x +" + " + y + " = " + z);
	}
	public void minus(int x, int y) {
		int z = x - y;
		System.out.println(x + " - " + y + " = " + z );
		
	}


}



























package Interface;

// Unit 인터페이스 생성 
// 인터페이스는 다음과 같은 형식으로 정의된다

public interface Unit {
	// 기본적으로 인터페이스에 추가되는 모든 메서드는 
	// 추상메서드이기 때문에, abstract 키워드는 명시할 필요가 없다.
	
	public void attack();	//추상메서드라서 {구현부!!!} 가 필요없음
	public void shield();
}

package Unit;
//가장 기본 : 마린
public class Marine extends TerranUnit{
	//마린 생성자 만들어보자

	public Marine() {
	speak();			//생성시에 대사를 외친다
	}
	
	
	//오버라이드 기능을 통해 인터페이스에서 설정해준 speak()를 사용하자
	@Override
	public void speak() {
		System.out.println("나는 마린!!!");
		
	}
	
}

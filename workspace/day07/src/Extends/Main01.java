package Extends;

public class Main01 {

	public static void main(String[] args) {

		CalcParent calcP = new CalcParent();	//객체 선언
		System.out.println(calcP.plus(20, 10));
		
		CalcChild calcC = new CalcChild();
		System.out.println(calcC.times(20, 10));
		
		//상속으로 인한 기능 확장
		System.out.println(calcC.plus(20,10));
	}

}

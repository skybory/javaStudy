package exam_practice;
import java.util.Scanner;		//Scanner 를 쓰기 위한 준비(util 에서 Scanner를 import 해옴)
public class Main01 {

	public static void main(String[] args) {
		/*
		7. main 메서드를 포함하는 클래스를 생성 한다.(10점)
		8. 2개의 정수를 입력 받는다.(10점)
		9. 입력 받은 정수를 각각 출력 한다.(10점)
		10. main 메서드에서 Calc 클래스 객체 생성시 본인의 이름을 매개변수 값으로
		넘긴다.(5점)
		11. main 메서드에서 본인의 이름을 출력한다.(5점)
		12. Calc 클래스 객체를 사용하여 plus, minus 메소드를 사용하여 사칙 연산
		결과를 각각 출력 한다.(10점)
		13. Calc 클래스 객체를 사용하여 times, divide 메소드를 사용하여 사칙 연산
		결과를 각각 출력 한다.(10점
	*/
		
		Scanner sc = new Scanner(System.in);		//Scanner 클래스에서 객체 sc 만들기
		System.out.println("첫 번째 숫자를 입력해주세요");
		int a = sc.nextInt();
	
		System.out.println("첫 번째 숫자를 입력해주세요");
		int b = sc.nextInt();
		
		System.out.println("입력된 숫자는 : " + a);
		System.out.println("입력된 숫자는 : " + b);
		
		Calc c = new Calc("김태연");		//10 번. 본인의 이름을 매개변수로 넘기기?
		c.getName();
		
		System.out.println(c.getName());
		System.out.println(c.plus(a, b));
		System.out.println(c.minus(a, b));
		System.out.println(c.times(a, b));
		System.out.println(c.divide(a, b));
	}

}

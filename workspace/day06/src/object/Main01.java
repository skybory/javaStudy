package object;
class Student{					//	학생 관리를 위한 설계도를 하나 만듦.
								// 	멤버변수만 정의되어 있는 클래스를 정의해보자.
String name = "자바학생";
int age = 20;						
}
public class Main01 {
	
public static void main(String[] args) {
	
	
	
	//객체의 선언과 할당의 분리
	Student std1;					//	객체 생성
	std1 = new Student();			//	객체 할당

	// 객체의 선언과 할당 일괄지정	
	Student std2 = new Student();	//	객체 생성 및 할당	




	System.out.println("std1.name : " +	std1.name);
	System.out.println("std1.age : " + std1.age);
	System.out.println("std2.name : " + std2.name);
	System.out.println("std2.age : " + std2.age);

	System.out.println("---------------------------------------");
	
	std1.name = "이순신";
	std1.age = 100;
	
	std2.name = "홍길동";
	std2.age = 1000;
	
	System.out.println("std1.name : " +	std1.name);
	System.out.println("std1.age : " + std1.age);
	System.out.println("std2.name : " + std2.name);
	System.out.println("std2.age : " + std2.age);

	System.out.println("---------------------------------------");
	
	}

}

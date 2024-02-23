package object;

class Character{
	// 멤버변수만 선언
	String name;
	int age;
	String job;

}


public class Main02 {

	public static void main(String[] args) {
		// character 클래스를 가지고 객체2개 생성 후,
		// 각 객체별 name, age, job 을 할당 후 출력
		
		Character cha1 = new Character();
		Character cha2;
		cha2 = new Character();
		
		cha1.name = "김김김";
		cha1.age = 20;
		cha1.job = "회사원";
		
		cha2.name = "김이박";
		cha2.age = 40;
		cha2.job = "공무원";
		
		System.out.println("1번 캐릭터의 이름은 : " + cha1.name);
		System.out.println("1번 캐릭터의 나이는 : " + cha1.age);
		System.out.println("1번 캐릭터의 직업은 : " + cha1.job);
		
		System.out.println("==================================");
		
		System.out.println("2번 캐릭터의 이름은 : " + cha2.name);
		System.out.println("2번 캐릭터의 나이는 : " + cha2.age);
		System.out.println("2번 캐릭터의 직업은 : " + cha2.job);
		
		
	}

}



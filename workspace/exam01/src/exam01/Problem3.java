package exam01;

public class Problem3 {

	public static void main(String[] args) {

		//3. while 문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때
		//나오는 눈을 (눈1, 눈2) 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를
		//던지고, 눈의 합이 5이면 실행을 멈추 는 코드를 작성해보세요. 눈의 합이 5가
		//되는 경우는 (1, 4), (4, 1), (2, 3), (3, 2)입니다.(10)
		
		Dice d = new Dice();		//Dice 클래스의 객체 d 생성

		while (d.getNum1()+d.getNum2()!=5) {	//객체 d의 눈1, 눈2의 합이 5가 아니라면
			d.dice();							//다시 주사위를 던진다
		}
				
	}
}


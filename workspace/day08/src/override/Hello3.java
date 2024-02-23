package override;

public class Hello3 {
	public Hello3(String msg) {	//String 타입의 문자열 msg 를 파라미터로 받아오는 생성자
		System.out.println();
	}

}


class Korean3 extends Hello3 {	// 부모클래스 Hello3의 생성자 파라미터 String msg가 없기 때문에 에러가 생김
	public Korean3(String msg) {	// 마찬가지로 생성자를 만들어 주고, (놀랍게도 파라미터의 수를 늘려서 int a 파라미터를 추가할 수 있음.
									// 따라서 String msg는 상속받기 위한 최소한의 파라미터.
		super(msg);					// 부모 클래스의 생성자 파라미터에서 사용한 값 msg를 그대로 가져옴.
		/* 부모와 동일한 파라미터를 받도록 생성자를 정의하고
		 * 전달받은 파라미터를 부모에게 재전달한다.
		 */
	}

}
  
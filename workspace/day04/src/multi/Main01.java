package multi;

public class Main01 {

	public static void main(String[] args) {

		int target = 100;
		// int num = 0; 					// if 문 위에서 선언을 하기 때문에 if 와 else 에서 중복 선언 에러가 나옴.
		if(target == 100) {
			int num = target + 100;
		} else {
			int num = target - 100; 		// int 문 밖으로 나오면서 ( 다른 블록이기 때문에) 중복 선언이 아니게 됨.
		}
	}

}

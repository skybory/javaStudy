package operator;

public class Main02 {

	public static void main(String[] args) {
		int source = 100;
		
		source += 100;	// source = source + 100; 	200
		System.out.println("source 값은 : " + source + " 입니다.");
		
		source -= 50;	// source = source - 50;	150
		System.out.println("source 값은 : " + source + " 입니다.");
		
		source *= 2;	// source = source * 2;		300
		System.out.println("source 값은 : " + source + " 입니다.");
		
		source /= 100;	// source = source / 100;	3
		System.out.println("source 값은 : " + source + " 입니다.");
		
		source %= 2;	// source = source % 2;		1 ( 3나누기 2의 나머지가 1 )
		System.out.println("source 값은 : " + source + " 입니다.");

		//값을 예측하고 확인하는 과정으로 'println'를 쓰는것!!
		
				
	}

}

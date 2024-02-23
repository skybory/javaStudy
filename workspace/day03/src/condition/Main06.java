package condition;

public class Main06 {

	public static void main(String[] args) {
//6.  서로 다른 특정 정수값 a b c , a = 10 , b  = 20 , c = 9 최대값
		 
		int a = 10;
		int b = 20;
		int c = 9;
		
		int max = 0;
		if (a > b && a > c) { 
			max = a;		
		}	else { if (b > c)
			{max = b;
		} else {
			max = c;
		}

	}
		System.out.println("최대값은 : " + max);
	}
}


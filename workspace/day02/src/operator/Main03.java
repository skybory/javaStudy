package operator;

public class Main03 {

	public static void main(String[] args) {
		
		int plus_num = 1;					//1
			
		plus_num = plus_num + 1;			//2
		
		plus_num += 1;						//3
		
		plus_num++;							//4
		
		++plus_num;							//5
		
		System.out.println("plus_num : " + plus_num);
	
		int minus_num = 5;					//5
		
		minus_num = minus_num - 1;			//4
		
		minus_num -= 1;						//3
		
		minus_num--;						//2
		
		--minus_num;						//1

		System.out.println("minus_num : " + minus_num);

		
		int a = 100;
		int i = 1; 			// 선언 및 할당
		int y = a + i++; 	// 수식에 먼저 적용하고, 나중에 X값을 1 더함 , 따라서 y = 101

		
		int b = 100;
		int j = 1; 			// 선언 및 할당
		int z = b + ++j;	// 먼저 xx값에 1을 더하고, 수식에 적용시킴 , 따라서 yy = 102

		System.out.println("y : " + y);
		System.out.println("yy : " + z);
		
	
		
	}

}

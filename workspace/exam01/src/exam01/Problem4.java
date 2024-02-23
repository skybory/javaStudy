package exam01;

public class Problem4 {
	public static void main(String[] args) {
	
/*	4. 다음의 for 문을 while 문으로 변경하시오.(10)
		public class Main01 {
		//public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
		for(int j=0; j<=i; j++) {
		System.out.print("*");
		}
		System.out.println();
		}
*/
	int i = 0;
	while (i <= 10) {
		int j = 0;
		while ( j<= i) {
			j++;
			System.out.print("*");
		}
		i++;
		System.out.println();
	}
	
	}
}

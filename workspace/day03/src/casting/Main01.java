package casting;

public class Main01 {

	public static void main(String[] args) {
long l = 100L;
int i = (int) l; //명시적 형변환
short s = (short) i;

System.out.println("l = " + l);
System.out.println("i = " + i);
System.out.println("s = " + s);
System.out.println("=========================");

double pi1 = 3.14D;
int pi2 = (int) pi1;
System.out.println("pi1 : " + pi1);
System.out.println("pi2 : " + pi2);
System.out.println("=========================");		
		// 'a' 에 해당하는 아스키코드 -> 97
		// 'c' 에 해당하는 아스키코드 -> 99
	int num1 = 97;
	char c2 = (char) (num1 + 2);
	System.out.println("c2 : " + c2);
	
	// 97+2 = 99, int형 변환후 연산이므로 숫자 99가 나올것이지만, c2 = (char) (num1 + 2) 에서 99 가 다시 char로 형변환되고, 알파벳 c가 나옴.
	
	
	}

}

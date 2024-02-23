package loop;

public class Main05 {

	public static void main(String[] args) {

		//구구단 7단. do~while 문
		int i = 1;
		int j = 0;
		do {
			j = 7 * i;
			i++;
			System.out.println(j);
		} while (i < 10);
	}

}

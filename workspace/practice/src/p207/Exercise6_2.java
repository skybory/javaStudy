package p207;

public class Exercise6_2 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1, 1, 100, 60, 76);
		
		String str = s.info();
		System.out.println(str);
		
		//total 을 double형으로 하면 total값이 236이 아닌 236.0 이 되어버리고
		//total 을 int형으로 하면 avg값이 78이 되어버림(정수 결과값을 나누기 때문)
	}

}

package object;

class User {
	String name;
	int age;
	User(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(age);
		System.out.println(name);
	}
}


public class Main03 {

	public static void main(String[] args) {

		User u = new User("자바학생", 20);
		User ty = new User("김태연", 25);
		System.out.println(u.age);
		System.out.println(u.name);
		
	}

}

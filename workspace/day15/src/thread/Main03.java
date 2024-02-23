package thread;

public class Main03 {

	public static void main(String[] args) {
			// Runnable 인터페이스 객체생성과
			// 객체를 매개변수로 하여 스레드 객체 한번에 생성
			Thread th1 = new Thread(new RunnableTest());
			Thread th2 = new Thread(new RunnableTest());
	
			// 동시에 똑같은 숫자가 나온다 = start 메서드는 직원을 고용하는 과정(Thread를 더 만드는)부터 시작함.
//			th1.start();
//			th2.start();

			// 번갈아가면서 나옴(직원을 고용하지 않고 (=새로운 스레드 없이) main 스레드를 이용하기 때문)
//			th1.run();
//			th2.run();
			
			
			
			
			
			
			
	
	}

}

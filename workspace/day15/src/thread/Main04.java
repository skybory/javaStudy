package thread;

public class Main04 {

	public static void main(String[] args) {

		ThreadInterruptedTest th = 
				new ThreadInterruptedTest();
		
		th.start();
		
		// 3초 후에 인터럽트
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		th.interrupt();
	}

		
}

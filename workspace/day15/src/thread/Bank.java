package thread;

public class Bank extends Thread{
	static Account obj = new Account();
	public Bank(String name) {
		super(name);
	}

	@Override
	public void run() {
			
		
		while(true) {
			synchronized (obj) {
				int money = (int)(Math.random()*3 +1) * 100;
				
				if(obj.balance >= money) {
					System.out.println(getName() + " - 원금의 금액 : " + obj.balance);
					System.out.println(getName() + " - 찾는 금액 : " + money);
					obj.withdraw(money);
					System.out.println(getName()+ " - 수정된 금액 : " + obj.balance);
				
				}
				else { 
					System.out.println("잔액부족");
					break;
				}
				
				}
		}
	}
}

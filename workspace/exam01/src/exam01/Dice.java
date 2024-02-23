package exam01;

public class Dice {
private int ran1;
private int ran2;
private int num1;
private int num2;


public Dice() {
}


		public int getRan1() {
			return ran1;
		}


		public void setRan1(int ran1) {
			this.ran1 = ran1;
		}


		public int getRan2() {
			return ran2;
		}


		public void setRan2(int ran2) {
			this.ran2 = ran2;
		}


		public int getNum1() {
			return num1;
		}


		public void setNum1(int num1) {
			this.num1 = num1;
		}


		public int getNum2() {
			return num2;
		}


		public void setNum2(int num2) {
			this.num2 = num2;
		}

		

		public void dice() {
			int num1=0;
			int ran1;
			
			while(num1==0) {
				ran1 = (int) (Math.random() * 10);	//랜덤숫자 만들기
			while (ran1 <= 6) {						//랜덤숫자가 6 이하면
				num1 = ran1;						//num1 에 랜덤숫자 대입하기
				break;
				}
			}
			
			int num2=0;
			int ran2;
			while(num2==0) {
				ran2 = (int) (Math.random() * 10);	//랜덤숫자 만들기
			while (ran2 <= 6) {						//랜덤숫자가 6 이하면
				num2 = ran2;						//num2 에 랜덤숫자 대입하기
				break;
				}
			}
		
			System.out.println("(" + num1 + ", " + num2 + ")");		//(눈1, 눈2) 출력하기
			this.num1=num1;							//num1값 field에 저장하기
			this.num2=num2;							//num2값 field에 저장하기
			
		}
}

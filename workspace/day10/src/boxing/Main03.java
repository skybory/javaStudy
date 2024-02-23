package boxing;

public class Main03 {

	public static void main(String[] args) {
		//부대지정
		Unit[] units = new Unit[5];	//배열의 이름은 units
		
		units[0] = new AirForce("공군1호");	//객체 이름은 units[0]
		units[1] = new AirForce("공군2호");
		units[2] = new Navy("해군1호");
		units[3] = new Army("육군1호");
		units[4] = new Army("육군2호");
		
		//부대 일괄 공격
		//instanceof 사용해서 작성
		//units[i] 인스턴스를 Army,Navy,AirForce 와 비교
		//Army면 tank(), Navy면 nucleus(), AirForce면 bombing() 공격을 추가하자.
		
		
		
		for(int i=0; i<units.length; i++) {
			units[i].attack(); 		//override 된 메서드
		
			if(units[i] instanceof Army) {		//units[i] 가 Army의 instance라면?
				Army temp = (Army)units[i];		//Army class에 temp의 object를 만들고, units[i] 할당.
				temp.tank();
			}
			else if (units[i] instanceof Navy) {
				Navy temp = (Navy)units[i];
				temp.nucleus();
			}
			
			else if (units[i] instanceof AirForce) {
				AirForce temp = (AirForce)units[i];
				temp.bombing();
			}
		
		}
		
		//units[i] 는 temp 그릇에 잠깐 들어가서 거기에 해당하는 기능을 쓴 뒤, for 구문을 벗어나오면서 지역변수가 소멸함과 함께 temp 그릇이 사라진다.
		//즉, units[i]는 처음부터 끝까지 Unit 클래스에 있었고, for 구문에서 잠시 형변환을 해서 기능을 사용한것이다.
		
		//실험
		System.out.println("-------------------------------------");
		System.out.println(units[0]);
		
		 
	}

}

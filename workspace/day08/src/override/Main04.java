package override;

public class Main04 {

	public static void main(String[] args) {
		Army am = new Army();
		am.setName("육군");

		Navy nv = new Navy();
		nv.setName("해군");
	
		AirForce af = new AirForce();
		af.setName("공군");

		am.attack();
		am.tank();
		System.out.println("=======육군 종료=======");
		
		nv.attack();
		nv.nucleus();
		System.out.println("=======해군 종료=======");
		
		af.attack();
		af.bombing();
		System.out.println("=======공군 종료=======");
	}

	//Navy 객체생성 후 setName, 출력
	// AirForce 객체생성 후 setName, 출력
}

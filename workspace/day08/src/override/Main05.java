package override;

public class Main05 {

	public static void main(String[] args) {
		Army2 am = new Army2 ("육군");
		am.attack();
		am.tank();
		
		System.out.println("=======" + am.getName() + " 종료=======");
		
		Navy2 nv = new Navy2 ("해군");
		nv.attack();
		nv.nucleus();
		System.out.println("=======" + nv.getName() + " 종료=======");
		
		
		AirForce2 af = new AirForce2 ("공군");
		af.attack();
		af.bombing();
		System.out.println("=======" + af.getName() + " 종료=======");
	}

}

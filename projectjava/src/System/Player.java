package System;

public class Player {
	private String name;
	private static int myMineral;	//static은 객체의 생성 여부와 상관없이, 프로그램이 실행되자마자 생성된다. 따라서 static을 접근하려면 클래스명으로 접근해야한다.
	private static int myGas;
	private static int myPopulation;
	
	//이름,보유미네랄,보유가스,보유인구수에 대한 Getter&Setter 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	//static 값에 대한 getter setter 생성. static(고정메모리 영역) 에 접근하기 위해서 getter setter 또한 static 으로 만들어줘야한다. + myMineral 에 접근하기 위해 클래스명으로 접근함.
	
	public static int getMyMineral() {
		return myMineral;
	}
	public static void setMyMineral(int myMineral) {
		Player.myMineral = myMineral;
	}
	public static int getMyGas() {
		return myGas;
	}
	public static void setMyGas(int myGas) {
		Player.myGas = myGas;
	}
	public static int getMyPopulation() {
		return myPopulation;
	}
	public static void setMyPopulation(int myPopulation) {
		Player.myPopulation = myPopulation;
	}
	//생산자
	public Player(String name, int myMineral, int myGas, int myPopulation) {
		super();
		this.name = name;
		this.myMineral = myMineral;
		this.myGas = myGas;
		this.myPopulation = myPopulation;
	}
	
	
	
}

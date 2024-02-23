package practice;

class Tv{						//Tv 클래스 선언(클래스의 첫자는 반드시 대문자를 써주도록 하자)
	int volume = 10;			//전역변수 volume 선언, 값 10을 할당
	boolean power = true;		//전역변수 power 선언, 및 true값 할당. true / false 를 통해 전원상태 표시
	int channel = 30;			//전역변수 channel 선언, 값 30 할당
	
	void changePower() {		//changePower 메서드 선언
		power = !power;			//호출시 파워의 상태를 변환. ture -> false, 또는 false -> true
		System.out.println("전원 변환");
	}							
	
	void channelUp() {			//channelUp 메서드 선언
		channel++;				//호출시 전역변수 channel 의 값을 1 만큼 높임
		System.out.println("채널 1 증가");
	}	
	void channelDown() {		//channelDown 메서드 선언
		channel--;				//호출시 전역변수 channel 의 값을 1 만큼 낮춤
		System.out.println("채널 1 감소");
	}

	void volumeUp() {			//volumeUp 메서드 선언
		volume++;				//호출시 전역변수 volume 의 값을 1 만큼 높임
		System.out.println("볼륨 1 증가");
	}
	void volumeDown() {			//volumeDown 메서드 선언
		volume--;				//호출시 전역변수 volume 의 값을 1 만큼 낮춤
		System.out.println("볼륨 1 증가");
	}
	
	void showChannel() {		//showChannel 메서드 선언
		int result = 0;			//int형 지역변수 result 선언 및 값 0 할당
		result = channel;		//지역변수 result에 전역변수 channel 값 대입
System.out.println("현재 채널 : " + result);	 //현재 채널값을 표현
	}
	
}
//TV 설계도 만들기 끝

public class Day06_Object_Practice2 {

	public static void main(String[] args) {
Tv television1;								//Tv 라는 class(설계도)로, television1 이라는 object(객체,물건)을 선언
television1 = new Tv();						//television1 칸에 값을 할당

Tv television2 = new Tv();					//Tv 라는 class에 television2 라는 object를 선언 및 할당

System.out.println(television1.power);		//television1의 power 출력, 출력값 : true
television1.changePower();					//television1의 power 상태 변환, true -> false
System.out.println(television1.power);		//television1의 power 출력, 출력값 : false

System.out.println(television1.channel);	//television1의 채널 출력, 출력값 : 30
television1.channelDown();					//television1의 채널 1 낮춤
television1.channelDown();					//television1의 채널 1 낮춤
System.out.println(television1.channel);	//television1의 채널 출력, 출력값 : 28
television1.channelUp();					//television1의 채널 1 높임
System.out.println(television1.channel);	//television1의 채널 출력, 출력값 : 29
television1.showChannel();					//showChannel을 통해 현재 채널 출력

System.out.println(television1.volume);		//television1의 볼륨 출력, 출력값 : 10
television1.volumeUp();						//television1의 볼륨 1 높임
television1.volumeUp();						//television1의 볼륨 1 높임
System.out.println(television1.volume);		//television1의 볼륨 출력, 출력값 : 12

System.out.println(television2.channel);	//television2의 채널 출력, 출력값 : 30
System.out.println(television2.power);		//television2의 power 출력, 출력값 : true
System.out.println(television2.volume);		//television2의 volume 출력, 출력값 : 10
	}

}

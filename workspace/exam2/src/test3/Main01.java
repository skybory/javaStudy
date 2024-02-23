package test3;

public class Main01 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setPowerOn(false);
		t.setChannel(10);
		t.setVolume(20);
		System.out.println(t.toString());

		
		t.setPowerOn(true);
		t.setChannel(10);
		t.setVolume(20);
		System.out.println(t.toString());
		

		t.setPowerOn(true);
		t.setChannel(35);
		t.setVolume(20);
		System.out.println(t.toString());
		
		t.gotoPrevChannel();
		System.out.println(t.toString());

		// 9.isPowerOn false인 상태로 channel, volume 수정 후, toString()으로 확인
		
		// 10.isPowerOn true인 상태로 channel, volume 수정 후, toString()으로 확인
		
		// 11.isPowerOn true인 상태로 channel만 수정 후, toString()으로 확인
		
		// 12.gotoPrevChannel()(이전 채널로 되돌리기) 호출 후, toString()으로 확인
		
	}

}

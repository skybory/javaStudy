package test3;

public class MyTv {
	private boolean isPowerOn;		// 파워
	private int channel;			// 채널
	private int volume;			// 볼륨
	private int prevChannel; 		// 이전 채널
	
	final int MAX_VOLUME = 100;	// 최대볼륨
	final int MIN_VOLUME = 0;		// 최소볼륨
	final int MAX_CHANNEL = 100;	// 최대채널
	final int MIN_CHANNEL = 1;		// 최소채널

	public void setVolume(int volume) {
		
		if(!(volume > MAX_VOLUME && volume < MIN_VOLUME || isPowerOn != true)) {

			// 1.volume이 최대 볼륨보다 크고, 최소볼륨보다 작고, 파워가 꺼져있으면 볼륨 설정 불가능  
			// 2.전역변수 volume에 param값 volume 할당
			this.volume = volume;
		}
		
	}

	public int getVolume() {
		return volume;
	}

	public void setChannel(int channel) {
		if(!(channel > MAX_CHANNEL && channel < MIN_CHANNEL || isPowerOn != true)) {
			// 3.channel이 최대 채널보다 크고, 최소 채널보다 작고, 파워가 꺼져있으면 채널 설정 불가능
			prevChannel = this.channel;
			this.channel = channel;
		}
		// 4.현재 채널을 이전 채널에 저장한다.
		// 5.전역변수 channel에 param값 channel 할당
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		
		this.isPowerOn = isPowerOn;
		// 6.전역변수 isPowerOn에 param값 isPowerOn 할당
	}

	public int getChannel() {
		return channel;
	}

	// 7.현재 체널을 이전 채널로 변경한다
	public void gotoPrevChannel() {
		int temp = 0;
		temp = this.channel;
		this.channel = this.prevChannel;
		this.prevChannel = temp;
	}

	@Override
	public String toString() {
		return "MyTv [isPowerOn=" + isPowerOn + ", channel=" + channel + ", volume=" + volume + ", prevChannel="
				+ prevChannel + ", MAX_VOLUME=" + MAX_VOLUME + ", MIN_VOLUME=" + MIN_VOLUME + ", MAX_CHANNEL="
				+ MAX_CHANNEL + ", MIN_CHANNEL=" + MIN_CHANNEL + "]";
	}

	// 8.toString() 생성
	
	
	
}

package com.javaex.ex12;

public class TVApp {

	public static void main(String[] args) {

		TV tv = new TV(7, 20, false);

		tv.status();

		tv.power(true);
		tv.volume(130);							//	볼륨 120으로 키우기 실행안되는중
		tv.status();

		tv.volume(true);						//	볼륨 1 감소 실행안되는중
		tv.status();

		tv.channel(-1);								//	채널 0번 이동 실행안되는중
		tv.status();

		tv.channel(true);						//	채널 1 증가 실행안되는중
		tv.channel(true);						//	채널 1 증가 실행안되는중
		tv.channel(true);						//	채널 1 증가 실행안되는중
		tv.status();

		tv.power(false);
		tv.status();

	}

}

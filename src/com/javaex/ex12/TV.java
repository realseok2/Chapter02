package com.javaex.ex12;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

//==========================================
	// getter
	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

//===========================================
	// 생성자
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

//===========================================
	// 메소드
	public void power(boolean on) {
		if (on == true) {
			power = true;
			System.out.println("TV ON");
		} else {
			power = false;
			System.out.println("TV OFF");
		}
	}

	// ------------------------------------------------------------------- channel
	// 범위 1~255 int는 유지 boolean은 1씩 증감
	public void channel(int channel) {
		if (channel > 255) {
			System.out.println("You can't move up channel 255");
		} else if (channel < 1) {
			System.out.println("You can't move down channel 1 ");
		} else {
			this.channel = channel;
		}
	}

	public void channel(boolean up) {
		if (up == true) {
			if (channel > 255) {
				System.out.println("You can't move up channel No.255");
			} else {
				channel = channel + 1;
			}
		} else {
			if (channel <= 0) {
				System.out.println("You can't move down channel No.1 ");
			} else {
				channel = channel - 1;
			}
		}
	}

//--------------------------------------------------------------------	volume 범위 0 ~ 100 int는 유지 boolean은 1씩 증감	
	public void volume(int volume) {
		if (volume > 100) {
			System.out.println("You can't move up volume 100");
		} else if (volume < 0) {
			System.out.println("You can't move down volume 0 ");
		} else {
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if (up == true) {
			if (volume > 100) {
				System.out.println("You can't move up volume 100");
			} else {

				volume = volume + 1;

			}
		} else {
			if (volume < 0) {
				System.out.println("You can't move down volume 0 ");
			} else {

				volume = volume - 1;

			}
		}
	}

	// ===========================================
	// status
	public void status() {
		if (power == true) {
			System.out.println("[ Channel = " + channel + ",\t Volume = " + volume + ",\t Power = On  입니다. ]\n\n");
		} else {
			System.out.println("[ Channel = " + channel + ",\t Volume = " + volume + ",\t Power = Off  입니다. ]\n\n");
		}
	}

}

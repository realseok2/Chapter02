package com.javaex.TS_TV;

public class TV {

	private int channel;
	private int volume;
	private boolean power;

//-------------------------------------------------------------
	// setter, getter

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}

//-------------------------------------------------------------	
	// 생성자
	public TV() {
	}

	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

//-------------------------------------------------------------	
//-------------------------------------------------------------						Power
	// 메소드
	public void power(boolean on) {
		if (on == true) {
			System.out.println("TV On");
		} else {
			System.out.println("TV Off");
		}
	}

//-------------------------------------------------------------						Channel 1 ~ 255 // int - 값 유지 // boolean - 1씩 증감
	public void channel(int channel) {
		if (channel > 255) {
			System.out.println("[ You can't go over Channel 255 ]");
		} else if (channel < 1) {
			System.out.println("[ You can't go below Channel 1 ]");
		} else {
			this.channel = channel;
		}

	}

	public void channel(boolean up) {
		if (channel > 255) {
			System.out.println("[ You can't go over Channel 255 ]");
		} else if (channel < 1) {
			System.out.println("[ You can't go below Channel 1 ]");
		} else {
			if (up == true) {
				channel = channel + 1;
			} else {
				channel = channel - 1;
			}
		}
	}

//-------------------------------------------------------------						Volume 0 ~ 100 // int - 값 유지 // boolean - 1씩 증감 
	public void volume(int volume) {
		if (volume > 100) {
			System.out.println("[ You can't go over Volume 100 ]");
		} else if (volume < 0) {
			System.out.println("[ You can't go below Volume 0 ]");
		} else {
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if (volume > 100) {
			System.out.println("[ You can't go over Volume 100 ]");
		} else if (volume < 0) {
			System.out.println("[ You can't go below Volume 0 ]");
		} else {

			if (up == true) {
				if (volume > 100) {
					System.out.println("[ You can't go over Volume 100 ]");
				} else {
					volume = volume + 1;
				}
			} else {
				if (volume < 0) {
					System.out.println("[ You can't go below Volume 0 ]");

				} else {
					volume = volume - 1;
				}

			}
		}
	}

//-------------------------------------------------------------	
//-------------------------------------------------------------	
	public void status() {
		if (power == true) {
			System.out.println("[ Channel : " + channel + "\t Volume : " + volume + "\t Power : On ]");
		} else {
			System.out.println("[ Channel : " + channel + "\t Volume : " + volume + "\t Power : Off ]\n");
		}

	}
}
package com.javaex.ex07;

public class Ex07_SongApp {

	public static void main(String[] args) {

		Ex07_Song no1 = new Ex07_Song();
		Ex07_Song no2 = new Ex07_Song();
		Ex07_Song no3 = new Ex07_Song();
		Ex07_Song no4 = new Ex07_Song();
		Ex07_Song no5 = new Ex07_Song();

		no1.setArtist("Lolo Zouai");
		no1.setTitle("Out the bottle");
		no1.setAlbum("High High to Low Lows");
		no1.setYear(2019);
		no1.setTrack(10);
		no1.setComposer("Lolo zouai");

		no2.setArtist("Billie Eilish");
		no2.setTitle("all the good girls go to hell");
		no2.setAlbum("WHEN WE ALL FALL ASLEEP, WHERE DO WE GO?");
		no2.setYear(2019);
		no2.setTrack(5);
		no2.setComposer("Billie Eilish");

		no3.setArtist("Christopher");
		no3.setTitle("Bad");
		no3.setAlbum("Under the Surface");
		no3.setYear(2019);
		no3.setTrack(7);
		no3.setComposer("Christopher");

		no4.setArtist("10cm");
		no4.setTitle("스토커");
		no4.setAlbum("3.0");
		no4.setYear(2014);
		no4.setTrack(3);
		no4.setComposer("권정렬");

		no5.setArtist("프리스타일");
		no5.setTitle("그리고 그 후");
		no5.setAlbum("2007 Memories");
		no5.setYear(2007);
		no5.setTrack(5);
		no5.setComposer("미노");

		no1.showInfo();
		no2.showInfo();
		no3.showInfo();
		no4.showInfo();
		no5.showInfo();

	}

}

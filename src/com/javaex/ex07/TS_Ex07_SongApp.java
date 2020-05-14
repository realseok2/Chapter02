package com.javaex.ex07;

public class TS_Ex07_SongApp {

	public static void main(String[] args) {

		TS_Ex07_Song no1 = new TS_Ex07_Song();
		TS_Ex07_Song no2 = new TS_Ex07_Song();
		TS_Ex07_Song no3 = new TS_Ex07_Song();
		TS_Ex07_Song no4 = new TS_Ex07_Song();
		TS_Ex07_Song no5 = new TS_Ex07_Song();

		no1.setArtist("Lolo Zouai");
		no1.setTitle("Out the Bottle");
		no1.setAlbum("High Highs to Low Lows");
		no1.setYear(2019);
		no1.setTrack(10);
		no1.setComposer("Lolo Zouai");
		no1.showInfo();
//		===================================================

		no2.setArtist("Billie Eilish");
		no2.setTitle("All the good girls go to hell");
		no2.setAlbum("WHEN WE ALL FALL ASLEEP, WHERE DO WE GO?");
		no2.setYear(2019);
		no2.setTrack(5);
		no2.setComposer("Billie Eilish");
		no2.showInfo();
//		===================================================

		no3.setArtist("Ariana Grande");
		no3.setTitle("7rings");
		no3.setAlbum("7rings");
		no3.setYear(2019);
		no3.setTrack(1);
		no3.setComposer("Ariana Grande");
		no3.showInfo();
//		===================================================

		no4.setArtist("ColdPlay");
		no4.setTitle("Hymn For The Weekend");
		no4.setAlbum("Hymn For The Weekend");
		no4.setYear(2016);
		no4.setTrack(1);
		no4.setComposer("Coldplay");
		no4.showInfo();
//		===================================================

		no5.setArtist("Christopher");
		no5.setTitle("Bad");
		no5.setAlbum("Under The Surface");
		no5.setYear(2019);
		no5.setTrack(7);
		no5.setComposer("Christopher");
		no5.showInfo();
//		===================================================

	}

}

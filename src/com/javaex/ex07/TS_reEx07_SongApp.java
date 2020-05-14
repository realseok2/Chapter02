package com.javaex.ex07;

public class TS_reEx07_SongApp {

	public static void main(String[] args) {

		TS_reEx07_Song no1 = new TS_reEx07_Song();
		TS_reEx07_Song no2 = new TS_reEx07_Song();
		TS_reEx07_Song no3 = new TS_reEx07_Song();

		
//=======================================================
		no1.setArtist("아이유");
		no1.setTitle("좋은날");
		no1.setAlbum("Real");
		no1.setYear(2010);
		no1.setTrack(3);
		no1.setComposer("이민수");
		no1.showInfo();
//=======================================================
		no2.setArtist("BIGBANG");
		no2.setTitle("거짓말");
		no2.setAlbum("Always");
		no2.setYear(2007);
		no2.setTrack(2);
		no2.setComposer("G-DRAGON");
		no2.showInfo();
//=======================================================
		no3.setArtist("버스커버스커");
		no3.setTitle("벚꽃엔딩");
		no3.setAlbum("버스커버스커 1집");
		no3.setYear(2012);
		no3.setTrack(4);
		no3.setComposer("장범준");
		no3.showInfo();
//=======================================================
	}

}

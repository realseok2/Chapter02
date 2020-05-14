package com.javaex.ex07;

public class TS_reEx07_Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

//==============================================									Title setter, getter
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

//==============================================
//==============================================									Artist setter, getter
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

//==============================================
//==============================================									Album setter, getter
	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

//==============================================
//==============================================									Composer setter, getter
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}

//==============================================
//==============================================									Year setter, getter
	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

//==============================================
//==============================================									Track setter, getter
	public void setTrack(int track) {
		this.track = track;
	}

	public int getTrack() {
		return track;
	}
//==============================================

	public void showInfo() {
		System.out.println(artist + ", " + title + " ( " + album + ", " + year + "년, " + track + "번 track, " + composer + " 작곡 )");
	}

}

package com.javaex.ex09;

public class TS_Song01 {

	private String artist;
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;
//==============================================	
	//생성자
	public TS_Song01() {
			}
	
	
	
	//==============================================
	// set/get
	private String getArtist() {
		return artist;
	}

	private void setArtist(String artist) {
		this.artist = artist;
	}

	private String getTitle() {
		return title;
	}

	private void setTitle(String title) {
		this.title = title;
	}

	private String getAlbum() {
		return album;
	}

	private void setAlbum(String album) {
		this.album = album;
	}

	private String getComposer() {
		return composer;
	}

	private void setComposer(String composer) {
		this.composer = composer;
	}

	private int getYear() {
		return year;
	}

	private void setYear(int year) {
		this.year = year;
	}

	private int getTrack() {
		return track;
	}

	private void setTrack(int track) {
		this.track = track;
	}
//==============================================
	// 메소드

	
	
	
	
	
//==============================================
	// toString
	public String toString() {
		return "TS_Song01 [artist=" + artist + ", title=" + title + ", album=" + album + ", composer=" + composer
				+ ", year=" + year + ", track=" + track + "]";
	}

}

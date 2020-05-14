package com.javaex.ex07;

public class Ex07_Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	
//============================================================
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}
//============================================================
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	//============================================================
	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}
	//============================================================
	public void setYear(int year) {
		this.year = year;
	}

	public int getYeart() {
		return year;
	}
	//============================================================
	public void setTrack(int track) {
		this.track = track;
	}

	public int getTrack() {
		return track;
	}
	//============================================================
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}
	//============================================================
	
//	public void draw() {
//		System.out.println(artist + ", " + title + "\n( " + album + ", " + year + "년, " + track + "번 Track, " + composer + " 작곡 )\n\n");
//	}
	
	public void showInfo() {
		System.out.println("Artist : \t\t" + artist + "\t\tTitle : \t " + title + "\n( " + album + ",    " + year + "년,    " + track + "번 Track,    " + composer + " 작곡 )\n\n");
	}
	
	
	
	
	
	
	
}

package com.javaex.ex07;

public class TS_Ex07_Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	

	// alt + shift + s -> genrate getter and setter ->select all 하면 getter setter 생성
	

	// ================================================= artist getter, setter
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtiste() {
		return artist;
	}

//=================================================							title getter, setter
	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

//=================================================							album getter, setter
	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

//=================================================							year getter, setter
	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

//=================================================							track getter, setter
	public void setTrack(int track) {
		this.track = track;
	}

	public int getTrack() {
		return track;
	}

//=================================================							composer getter, setter
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}
//=================================================							showInfo

	public void showInfo() {
		System.out.println("Artist : " + artist + "\t\tTitle : " + title + "\n( " + album + ",\t\t" + year + "년,\t\t"
				+ track + "번 track,\t\t" + composer + "작곡 )\n\n");
	}

}

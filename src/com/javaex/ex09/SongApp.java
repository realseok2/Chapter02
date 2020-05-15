package com.javaex.ex09;

public class SongApp {

	public static void main(String[] args) {

		// default 생성자를 이용해서 인스턴스 생성 --> set, get 이용
		// setter로 데이터 입력
		// toString() 확인
		Song no1 = new Song();
//		Song no2 = new Song();
				
		no1.setArtist("아이유");
		no1.setTitle("좋은날");
		no1.setAlbum("Pink");
		no1.setComposer("이민수");
		no1.setYear(2010);
		no1.setTrack(3);
		
		System.out.println(no1.toString());

//======================================================================

		// x, y 같이 세팅하는 생성자를 이용 --> 추가로 만들어야 함
		// toString() 확인 <-- default 생성자 오류 확인
		Song no2 = new Song("아메리카노", "맛있다", "배고파", "집에가자", 82, 8282);
		System.out.println(no2.toString());
		
		
		
		// 오류제거 --> default 생성자를 만든다
	}

}

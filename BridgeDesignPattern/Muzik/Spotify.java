package Muzik;

public class Spotify implements MuzikCalar{


	public Spotify() {
		System.out.println("Spotify �ark� �al�yor.");
	}
	@Override
	public void MuzikCal(Sarki sarki) {
		System.out.println("Oynat�lan �ark� : " + sarki.sarkici + "-" + sarki.ad);
		
	}


}

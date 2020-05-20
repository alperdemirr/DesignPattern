package Muzik;

public class Spotify implements MuzikCalar{


	public Spotify() {
		System.out.println("Spotify þarký çalýyor.");
	}
	@Override
	public void MuzikCal(Sarki sarki) {
		System.out.println("Oynatýlan þarký : " + sarki.sarkici + "-" + sarki.ad);
		
	}


}

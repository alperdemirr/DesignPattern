package Voice;

import Muzik.MuzikCalar;

public class Hoporlor implements SesAygiti{
	
	private MuzikCalar muzikCalar;
	public Hoporlor() {
		System.out.println("Hoporl�rden ses geliyor.");
	}
	@Override
	public void muzikCalarEkle(MuzikCalar muzikCalar) {
		this.muzikCalar = muzikCalar;
	}

}

package Voice;

import Muzik.MuzikCalar;

public class Kulaklik implements SesAygiti{

	private MuzikCalar muzikCalar;
	public Kulaklik() {
		System.out.println("kulakl�ktan ses geliyor.");
	}
	@Override
	public void muzikCalarEkle(MuzikCalar muzikCalar) {
		this.muzikCalar = muzikCalar;
	}

}

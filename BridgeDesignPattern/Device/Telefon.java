package Device;

import Muzik.MuzikCalar;
import Voice.SesAygiti;

public class Telefon implements Cihaz{

	public MuzikCalar muzikCalar;
	public SesAygiti sesAygiti;
	public Telefon(MuzikCalar muzikCalar, SesAygiti sesAygiti) {
		this.muzikCalar = muzikCalar;
		this.sesAygiti = sesAygiti;
	}
	@Override
	public void cihaz(MuzikCalar muzikCalar, SesAygiti sesAygiti) {
		// TODO Auto-generated method stub
		
	}



}

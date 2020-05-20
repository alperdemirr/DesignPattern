package Device;

import Muzik.MuzikCalar;
import Voice.SesAygiti;

public class Bilgisayar implements Cihaz{

	public MuzikCalar muzikCalar;
	public SesAygiti sesAygiti;
	
	public Bilgisayar(MuzikCalar muzikCalar, SesAygiti sesAygiti) {
		this.muzikCalar = muzikCalar;
		this.sesAygiti = sesAygiti;
		
	}
	@Override
	public void cihaz(MuzikCalar muzikCalar, SesAygiti sesAygiti) {
		this.muzikCalar = muzikCalar;
		this.sesAygiti = sesAygiti;
		
	}



}

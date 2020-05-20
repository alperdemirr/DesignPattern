import Device.Bilgisayar;
import Device.Telefon;
import Muzik.Fizzy;
import Muzik.Sarki;
import Muzik.Spotify;
import Voice.Hoporlor;
import Voice.Kulaklik;

public class Test {

	public static void main(String[] args) {
		Sarki mfo = new Sarki("MFO","Ah bu ben");
		Sarki sebnemFerah = new Sarki("Sebnem Ferah", "Mayin Tarlasý");
		Bilgisayar bilgisayar = new Bilgisayar(new Fizzy(),new Kulaklik());
		bilgisayar.muzikCalar.MuzikCal(mfo);
		System.out.println("<-------------------->");
		Telefon telefon = new Telefon(new Spotify(), new Hoporlor());
		telefon.muzikCalar.MuzikCal(sebnemFerah);
	}
	


}

package Muzik;

public class Fizzy implements MuzikCalar{

	public Fizzy() {
		System.out.println("Fizzy þarký çalýyor.");
	}
	@Override
	public void MuzikCal(Sarki sarki) {
		System.out.println("Oynatýlan þarký : " + sarki.sarkici + "-" + sarki.ad);
		
	}




}

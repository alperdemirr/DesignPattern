package Muzik;

public class Fizzy implements MuzikCalar{

	public Fizzy() {
		System.out.println("Fizzy �ark� �al�yor.");
	}
	@Override
	public void MuzikCal(Sarki sarki) {
		System.out.println("Oynat�lan �ark� : " + sarki.sarkici + "-" + sarki.ad);
		
	}




}

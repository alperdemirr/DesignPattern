
public class Buzdolabi implements ElektirikliEvAletleri{

	private int volt;
	
	public Buzdolabi() {
		this.volt = 220;
	}

	@Override
	public int prizeTakVeCalistir() {
		return volt;
	}
	
}

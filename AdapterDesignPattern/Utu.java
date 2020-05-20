
public class Utu implements ElektirikliEvAletleri{

	private int volt;
	
	public Utu() {
		this.volt = 220;
	}
	@Override
	public int prizeTakVeCalistir() {
		return volt;
	}

	
}

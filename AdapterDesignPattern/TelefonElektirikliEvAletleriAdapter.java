
public class TelefonElektirikliEvAletleriAdapter implements ElektirikliEvAletleri{

	private Telefon telefon;
	
	public TelefonElektirikliEvAletleriAdapter(Telefon telefon) {
		this.telefon = telefon;
	}

	@Override
	public int prizeTakVeCalistir() {
		return telefon.sarjEt();
	}

}

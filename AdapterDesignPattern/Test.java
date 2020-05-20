
public class Test {

	public static void main(String[] args) {
		Priz priz = new Priz();
		
		Buzdolabi buzdolabi = new Buzdolabi();
		Utu utu = new Utu();
		priz.elektirikVer(buzdolabi);
		priz.elektirikVer(utu);
		
		SamsungTelefon samsungTelefon = new SamsungTelefon();
		
		TelefonElektirikliEvAletleriAdapter adapter = new TelefonElektirikliEvAletleriAdapter(samsungTelefon);
		
		priz.elektirikVer(adapter);
	}

}

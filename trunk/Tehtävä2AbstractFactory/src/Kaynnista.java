
public class Kaynnista {

	public static void main(String[] args) {
		AbstractFactory insinööri=BossFactory.getInstance();
		insinööri.luettele();
		AbstractFactory jasper= AdidasFactory.getInstance();
		jasper.luettele();
		

	}

}

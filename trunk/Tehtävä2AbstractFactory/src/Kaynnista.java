
public class Kaynnista {

	public static void main(String[] args) {
		AbstractFactory insin��ri=BossFactory.getInstance();
		insin��ri.luettele();
		AbstractFactory jasper= AdidasFactory.getInstance();
		jasper.luettele();
		

	}

}


public class Kaynnista {

	public static void main(String[] args) {
		AbstractFactory insinööri=new BossFactory();
		insinööri.luettele();
		AbstractFactory jasper=new AdidasFactory();
		jasper.luettele();
		

	}

}

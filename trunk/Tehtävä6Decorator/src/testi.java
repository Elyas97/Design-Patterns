
public class testi {

	public static void main(String[] args) {
		Pizza minunPizza=new Tomaatti(new Tonnikala(new Juusto(new TavallinenPizza())));
		System.out.println(minunPizza.getDescription()+" ..Pizzan Hinta:" +minunPizza.getPrice());
		Pizza pelkkäJuusto=new Juusto(new TavallinenPizza());
		System.out.println(pelkkäJuusto.getDescription()+" ..Pizzan Hinta: "+ pelkkäJuusto.getPrice());
		Pizza pelkkäTonnikala= new Tonnikala(new TavallinenPizza());
		System.out.println(pelkkäTonnikala.getDescription() +" ..Pizzan Hinta: "+ pelkkäTonnikala.getPrice());

	}

}

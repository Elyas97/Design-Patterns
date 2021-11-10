
public class testi {

	public static void main(String[] args) {
		Pizza minunPizza=new Tomaatti(new Tonnikala(new Juusto(new TavallinenPizza())));
		System.out.println(minunPizza.getDescription()+" ..Pizzan Hinta:" +minunPizza.getPrice());
		Pizza pelkk‰Juusto=new Juusto(new TavallinenPizza());
		System.out.println(pelkk‰Juusto.getDescription()+" ..Pizzan Hinta: "+ pelkk‰Juusto.getPrice());
		Pizza pelkk‰Tonnikala= new Tonnikala(new TavallinenPizza());
		System.out.println(pelkk‰Tonnikala.getDescription() +" ..Pizzan Hinta: "+ pelkk‰Tonnikala.getPrice());

	}

}

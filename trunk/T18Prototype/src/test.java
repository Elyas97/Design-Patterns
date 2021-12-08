
public class test {

	public static void main(String[] args) {
		Kello kello=new Kello();
		kello.etene();
		kello.etene();
		System.out.println(kello);
		//syväkopio
		Kello clone=(Kello) kello.clone();
		System.out.println(clone.toString());
		//näyttävät samaa tällä hetkellä
		clone.etene();
		clone.etene();
		System.out.println("Kellon aika: "+kello+".\n Cloonin aika:"+clone);
		
		//klooni kopoi kerran alkutilanteen sen jälkeen ei ole riippuvainen kello luokasta
		//kloonin sisäisen tilan muuttaminen ei vaikuta alkuperäiseen
	}

}


public class test {

	public static void main(String[] args) {
		Kello kello=new Kello();
		kello.etene();
		kello.etene();
		System.out.println(kello);
		//syv�kopio
		Kello clone=(Kello) kello.clone();
		System.out.println(clone.toString());
		//n�ytt�v�t samaa t�ll� hetkell�
		clone.etene();
		clone.etene();
		System.out.println("Kellon aika: "+kello+".\n Cloonin aika:"+clone);
		
		//klooni kopoi kerran alkutilanteen sen j�lkeen ei ole riippuvainen kello luokasta
		//kloonin sis�isen tilan muuttaminen ei vaikuta alkuper�iseen
	}

}

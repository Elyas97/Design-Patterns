
public class testi {

	public static void main(String[] args) {
		Laiteosa emo=new Emolevy(150); //composite luokka
		Laiteosa kotelo=new Kotelo(150);//composite luokka
		Laiteosa  proses=new Prosessori(400); //leaf
		Laiteosa muisti=new MuistiPiiri(10);//leaf
		kotelo.addOsa(emo);
		kotelo.addOsa(muisti);
		emo.addOsa(proses);
		emo.addOsa(muisti);
		emo.addOsa(proses);
		emo.addOsa(muisti);
		emo.addOsa(proses);
		emo.addOsa(muisti);
		emo.addOsa(proses);
		emo.addOsa(muisti);
		System.out.println("Koko hinta: " + kotelo.getHinta()+"€");
		
		
		
	}

}

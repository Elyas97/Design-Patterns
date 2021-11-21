
public class test {
public static void main(String[] args) {
	Arvuuttaja ar=new Arvuuttaja();
	Asiakas a=new Asiakas(ar);
	a.setName("eka");
	a.liityPeliin();
	Asiakas a2=new Asiakas(ar);
	a2.setName("toka");
	a2.liityPeliin();
	Asiakas a3=new Asiakas(ar);
	a3.setName("kolmas");
	a3.liityPeliin();
	//käynnistys
	a.start();
	a2.start();
	a3.start();
	
}
}

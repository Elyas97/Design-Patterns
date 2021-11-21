
public class Arvuuttaja {
private int numero;
private Asiakas asiakas;
public Object liityPeliin(Asiakas a1) {
	this.numero=(int) (Math.random()*3);
	System.out.println(numero);
	this.asiakas=a1;
	return new Memento(numero,asiakas);
}
public boolean arvaa(int numero,Asiakas a,Object o) {
	boolean temp=false;
	Memento memento =(Memento) o;
	if(memento.asiakas==a && memento.numero==numero) {
		temp=true;
		System.out.println(a.getName() +" Arvasi oikein "+numero+" Annettu:"+memento.numero );
	}else {
		temp=false;
		System.out.println(a.getName() +" Arvasi v‰‰rin "+numero+" Annettu:"+memento.numero );
	
	}
	return temp;
}

private	class Memento{
	private int numero;
	private Asiakas asiakas;
	public Memento(int numero,Asiakas as) {
		this.numero=numero;
		this.asiakas=as;
	}
		
	}
}


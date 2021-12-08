
public class Kello implements Cloneable{
private Viisari sekuntti;
private Viisari minuutti;
private Viisari tunti;
public Kello() {
	this.sekuntti=new Viisari(60);
	this.minuutti=new Viisari(60);
	this.tunti=new Viisari(24);
}
public void etene() {
	this.sekuntti.etene();
	if(this.sekuntti.getAika()==0) {
		this.minuutti.etene();
		
	if(this.minuutti.getAika()==0) {
			this.tunti.etene();
	}
	
	}
}
public String toString() {
	return tunti.getAika()+":"+minuutti.getAika()+":"+sekuntti.getAika();
}
public Object clone() {
	Kello s=null;
	try {
		s=(Kello) super.clone();
		s.sekuntti=(Viisari) sekuntti.clonee();
		s.minuutti=(Viisari) minuutti.clonee();
		s.tunti=(Viisari) tunti.clonee();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		System.out.println("error");
	}
	return s;
}
}

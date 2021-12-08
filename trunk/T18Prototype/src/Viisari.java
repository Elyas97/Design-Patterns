
public class Viisari implements Cloneable {
private int maxAika;
private int aika;
public Viisari(int maxAika) {
	this.maxAika=maxAika;
}
public void etene() {
	this.aika=this.aika+1;
	if(aika>=this.maxAika) {
		this.aika=0;
	}
}
public int getAika() {
	return this.aika;
}
public Object clonee() {
	try {
		return super.clone();
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
}
}

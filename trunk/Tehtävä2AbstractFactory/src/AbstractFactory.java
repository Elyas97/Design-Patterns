
public abstract class AbstractFactory {
	Farmarit farmari=null;
	Keng‰t kenk‰=null;
	Lippis lippis=null;
	Tpaita tPaita=null;
 public abstract Farmarit createFarmari();
 public abstract Tpaita createPaita();
 public abstract Lippis createLippis();
 public abstract Keng‰t createKeng‰t();
 public void luettele() {
	 farmari=createFarmari();
	 kenk‰=createKeng‰t();
	 lippis=createLippis();
	 tPaita=createPaita();
	 System.out.println("Minulla on p‰‰ll‰ "+farmari+", "+ tPaita +", "+kenk‰+" "+"ja "+ lippis );
 }
}

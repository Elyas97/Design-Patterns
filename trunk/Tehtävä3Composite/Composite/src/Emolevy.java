import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
	private double osaHinta;
	private double kokoHinta;
	List<Laiteosa> osatLista=new ArrayList<>();
	public Emolevy(double hinta) {
		this.osaHinta=hinta;
	}
	@Override
	public void addOsa(Laiteosa osa) {
		osatLista.add(osa);
		
	}

	@Override
	public void poistaOsa(Laiteosa osa) {
		osatLista.remove(osa);
		
	}

	@Override
	public void poistaKaikkiOsat() {
		osatLista.clear();
		
	}

	@Override
	public double getKaikkiHinta() {
		kokoHinta=osaHinta;
		for(Laiteosa o : osatLista ) {
			kokoHinta=kokoHinta+o.getHinta();
		}
		return kokoHinta;
	}

	@Override
	public void setHinta(double hinta) {
		osaHinta=hinta;
	}
	public int getMaara() {
		return osatLista.size();
	}

	@Override
	public double getHinta() {
		return osaHinta;
	}

}

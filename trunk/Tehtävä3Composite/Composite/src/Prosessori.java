
public class Prosessori implements Laiteosa {
	private double osaHinta;
	public Prosessori(double hinta) {
		this.osaHinta=hinta;
	}
	@Override
	public void addOsa(Laiteosa osa) {
		throw new RuntimeException("Ei voi suorittaa operaatiota");

	}

	@Override
	public void poistaOsa(Laiteosa osa) {
		throw new RuntimeException("Ei voi suorittaa operaatiota");

	}

	@Override
	public void poistaKaikkiOsat() {
		throw new RuntimeException("Ei voi suorittaa operaatiota");

	}


	@Override
	public double getHinta() {
		return osaHinta;
	}

	@Override
	public void setHinta(double hinta) {
		this.osaHinta=hinta;
		
	}

	@Override
	public double getKaikkiHinta() {
		throw new RuntimeException("Ei voi suorittaa operaatiota");
	}

}


public class AdidasFactory extends AbstractFactory {

	@Override
	public Farmarit createFarmari() {

		return new AdidasFarmari();
	}

	@Override
	public Tpaita createPaita() {

		return new AdidasTpaita();
	}

	@Override
	public Lippis createLippis() {

		return new AdidasLippis();
	}

	@Override
	public Kengät createKengät() {

		return new AdidasKengät();
	}

}

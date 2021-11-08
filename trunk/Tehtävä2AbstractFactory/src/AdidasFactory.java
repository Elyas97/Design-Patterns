
public class AdidasFactory extends AbstractFactory {
	
	private AdidasFactory() {};
	private static AdidasFactory INSTANCE=null;
	public static synchronized AdidasFactory getInstance() {
		if(INSTANCE==null) {
			INSTANCE= new AdidasFactory();
		}
		return INSTANCE;
	}

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

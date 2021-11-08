
public class BossFactory extends AbstractFactory {
	private BossFactory() {};
	private static BossFactory INSTANCE=null;
	public static synchronized BossFactory getInstance() {
		if(INSTANCE==null) {
			INSTANCE= new BossFactory();
		}
		return INSTANCE;
	}

	@Override
	public Farmarit createFarmari() {
		return new BossFarmari();
	}

	@Override
	public Tpaita createPaita() {
		return new BossTpaita();
	}

	@Override
	public Lippis createLippis() {
		return new BossLippis();
	}

	@Override
	public Kengät createKengät() {
		return new BossKengät();
	}

}

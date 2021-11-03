
public class BossFactory extends AbstractFactory {

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


public class AIAdapter implements Driver {
	private AIDriver ai;
	public AIAdapter(AIDriver ai) {
		this.ai=ai;
	}

	@Override
	public void drive() {
		ai.selfDrive();
	}

}

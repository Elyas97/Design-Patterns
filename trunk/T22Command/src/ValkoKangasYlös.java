
public class ValkoKangasYlös implements Command {
	private ValkoKangas k;
	public ValkoKangasYlös(ValkoKangas k) {
		this.k=k;
	}
	@Override
	public void execute() {
		k.ylös();
	}
	
	
}

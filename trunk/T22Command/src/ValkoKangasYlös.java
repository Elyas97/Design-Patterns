
public class ValkoKangasYl�s implements Command {
	private ValkoKangas k;
	public ValkoKangasYl�s(ValkoKangas k) {
		this.k=k;
	}
	@Override
	public void execute() {
		k.yl�s();
	}
	
	
}

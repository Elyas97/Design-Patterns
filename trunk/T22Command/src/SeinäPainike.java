
public class SeinšPainike {
	Command command;
	public SeinšPainike(Command c) {
		this.command=c;
	}
	public void paina() {
		command.execute();
	}
}


public abstract class Chain {
	private Chain successor;
	public void setSuccessor(Chain successor) {
		this.successor=successor;
	}
	public void handle(Raise raise){
		if(successor!=null) {
			successor.handle(raise);
		}
	}

}


public class Director extends Chain {
	public final double allowable=5;
	public void handle(Raise raise) {
		if(raise.getPercentage()<=allowable) {
			System.out.println("I as a Director approve your "+raise.getPercentage()+"% salary increase");
		}else {
			super.handle(raise);
		}
	}
}

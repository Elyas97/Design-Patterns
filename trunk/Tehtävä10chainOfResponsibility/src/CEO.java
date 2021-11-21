
public class CEO extends Chain {
	public final double allowable=50;
	public void handle(Raise raise) {
		if(raise.getPercentage()<=allowable) {
			System.out.println("I as a CEO approve your "+raise.getPercentage()+"% salary increase");
		}else {
			System.out.println("Your request of "+raise.getPercentage()+"% salary increase needs a board meeting");
		}
	}
}


public class Manager extends Chain {
public final double allowable=2;
public void handle(Raise raise) {
	if(raise.getPercentage()<=allowable) {
		System.out.println("I as a manager approve your "+raise.getPercentage()+"% salary increase");
	}else {
		super.handle(raise);
	}
}
}

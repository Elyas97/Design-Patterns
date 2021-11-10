
public class Tomaatti extends TäytteetDecorator {

	public Tomaatti(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	public String getDescription() {
		return pizza.getDescription()+" Tomaatti";
	}

	
	public double getPrice() {
	return pizza.getPrice()+ 1;
	}

}

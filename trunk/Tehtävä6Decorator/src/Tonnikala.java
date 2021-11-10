
public class Tonnikala extends TäytteetDecorator {

	public Tonnikala(Pizza pizza) {
		super(pizza);
		
	}
	
	public String getDescription() {
		return pizza.getDescription()+" Tonnikala";
	}

	
	public double getPrice() {
	return pizza.getPrice()+ 1.0;
	}

}

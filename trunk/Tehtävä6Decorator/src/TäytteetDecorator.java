
public abstract class TäytteetDecorator implements Pizza {
	Pizza pizza;
	public TäytteetDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription();
	}

	
	public double getPrice() {
	return pizza.getPrice();
	}
}

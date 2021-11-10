
public abstract class T�ytteetDecorator implements Pizza {
	Pizza pizza;
	public T�ytteetDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	public String getDescription() {
		return pizza.getDescription();
	}

	
	public double getPrice() {
	return pizza.getPrice();
	}
}


public class Juusto extends T�ytteetDecorator {

	public Juusto(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return pizza.getDescription()+" Juusto";
	}

	
	public double getPrice() {
	return pizza.getPrice()+ 2.0;
	}

}

import java.util.ArrayList;
import java.util.List;

public class McDonaldsBuilder implements IBurgerBuilder {
	private McBurger burg;
	@Override
	public void buildNewBurger() {
		burg=new McBurger();
		
	}

	@Override
	public void buildMeat() {
		burg.setMeat(new Liha("liha"));
		
	}

	@Override
	public void buildCheese() {
		burg.setCheese(new Cheese("juusto"));
		
	}

	@Override
	public void buildSalad() {
		burg.setSalad(new J‰‰vuoriSalaatti("J‰‰vuori salaatti"));
		
	}

	@Override
	public Object getBurger() {
		// TODO Auto-generated method stub
		return burg;
	}

}

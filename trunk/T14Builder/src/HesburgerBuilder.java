
public class HesburgerBuilder implements IBurgerBuilder {
	private HesBurger hes;
	@Override
	public void buildNewBurger() {
		hes=new HesBurger();
		
	}

	@Override
	public void buildMeat() {
		hes.setMeat("Liha");
		
	}

	@Override
	public void buildCheese() {
		hes.setCheese("Juusto");
		
	}

	@Override
	public void buildSalad() {
		hes.setSalad("J‰‰vuori Salaatti");
		
	}

	@Override
	public Object getBurger() {
		return hes;
	}

}

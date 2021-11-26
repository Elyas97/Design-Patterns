
public class Waiter {
private IBurgerBuilder burgeriBuilder;
public void setBurgerBuilder(IBurgerBuilder burgeriBuilder) {
	this.burgeriBuilder=burgeriBuilder;
}
public void valmistaBurger() {
	burgeriBuilder.buildNewBurger();
	burgeriBuilder.buildCheese();
	burgeriBuilder.buildMeat();
	burgeriBuilder.buildSalad();
}
}

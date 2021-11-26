
public class test {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		McDonaldsBuilder mcBuilder=new McDonaldsBuilder();
		waiter.setBurgerBuilder(mcBuilder);
		waiter.valmistaBurger();
		McBurger mcdonalds=(McBurger) mcBuilder.getBurger();
		System.out.println(mcdonalds);
		//hesburger
		HesburgerBuilder hesBuilder=new HesburgerBuilder();
		waiter.setBurgerBuilder(hesBuilder);
		waiter.valmistaBurger();
		HesBurger hes=(HesBurger) hesBuilder.getBurger();
		System.out.println(hes);

	}

}

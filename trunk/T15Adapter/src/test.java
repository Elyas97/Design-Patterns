
public class test {

	public static void main(String[] args) {
		Driver mikko=new TheDriver("Mikko");
		mikko.drive();
		AIDriver ai=new AIDriver();
		Driver adapter=new AIAdapter(ai);
		adapter.drive();

	}

}


public class TheDriver implements Driver {
	private String name;
	public TheDriver(String name) {
	this.name=name;	
	}
	@Override
	public void drive() {
		System.out.println(name+": Ajan kohteeseen");
		
	}



}

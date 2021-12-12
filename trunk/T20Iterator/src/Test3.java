import java.util.ArrayList;
import java.util.Iterator;

public class Test3 {
	public static void main(String[] args) {
		ArrayList<String> test=new ArrayList();
		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		test.add("5");
		test.add("6");
		test.add("7");
		//a)
		Iterator sama=test.iterator();
		
		IteratorTest threadT= new IteratorTest(sama);
		IteratorTest threadTi= new IteratorTest(sama);
		
		threadT.start();
		threadTi.start();
	//ajon aikainen poisto
		test.add("8");
		test.remove(5);
		//concurrent modifyexception
	}
	
}

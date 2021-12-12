import java.util.ArrayList;
import java.util.Iterator;

public class Test {

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
		Iterator eri=test.iterator();
		Iterator eri2=test.iterator();
		IteratorTest threadT= new IteratorTest(eri);
		IteratorTest threadTi= new IteratorTest(eri2);
		threadT.start();
		threadTi.start();
	//eri iteraattorit säie käy kaikki elementit

}
}
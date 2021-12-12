import java.util.Iterator;

public class IteratorTest extends Thread {
	Iterator it;
	public IteratorTest(Iterator it) {
		this.it=it;
	}
public void run() {
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<String> items=new ArrayList();
		items.add("Hei");
		items.add("Hei");
		items.add("Hei");
		items.add("Hei");
		items.add("Hei");
		items.add("Hei");
		ListConverter rivinvaihto=new StrategyOne();
		ListConverter jokaToinen=new StrategyTwo();
		ListConverter jokaKolmas=new StrategyThree();
		String eka=rivinvaihto.ListToString(items);
		String toka=jokaToinen.ListToString(items);
		String kolmas=jokaKolmas.ListToString(items);
		System.out.println("Strategy 1 \n"+ eka);
		System.out.println("Strategy 2 \n"+ toka);
		System.out.println("Strategy 3 \n"+ kolmas);

	}

}

import java.util.ArrayList;
import java.util.List;

public class McBurger {
	private List<TuoteOsat> osat;
	public McBurger() {
		osat=new ArrayList<>();
	}
	 public void setSalad(J‰‰vuoriSalaatti salad) {
		 osat.add(salad);
	 }
	 public void setMeat(Liha meat) {
		 osat.add(meat);
	 }
	 public void setCheese(Cheese cheese) {
		 osat.add(cheese);
	 }
	 
	 public String toString() {
		 String temp="";
		 for(TuoteOsat o: osat) {
			temp+= o.getName()+"\n";
		 }
		 return temp ;
	 }
}

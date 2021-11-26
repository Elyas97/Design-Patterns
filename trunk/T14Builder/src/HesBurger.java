
public class HesBurger {
 private StringBuilder osat;
 public HesBurger() {
	 osat=new StringBuilder();
 }
 
 public void setSalad(String Salad) {
	 osat.append(Salad+" ");
 }
 public void setMeat(String meat) {
	 osat.append(meat+" ");
 }
 public void setCheese(String cheese) {
	 osat.append(cheese+" ");
 }
 
 public String toString() {
	 return osat.toString();
 }

}

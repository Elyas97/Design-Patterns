import java.util.Iterator;
import java.util.List;

public interface ListConverter {
 public String ListToString(List structure);
}
class StrategyOne implements ListConverter{

	@Override
	public String ListToString(List structure) {
		//jokainen rivin vaihto iterator
		String data="";
		Iterator itr= structure.iterator();
		while(itr.hasNext()) {
			data+=itr.next()+"\n";
		}
		return data;
	}
	
}
class StrategyTwo implements ListConverter{

	@Override
	public String ListToString(List structure) {
		//joka toinen rivinvaihto taulukoksi
		String data="";
		String[] items=new String[structure.size()];
		//lista taulukoksi
		structure.toArray(items);
		//läpikäynti
		for(int i=0;i<items.length;i++) {
			if(i%2==0 && i>0) {
				data=data+"\n"+items[i]+" ";
			}else {
				data+=items[i]+" ";
			}
		}
		return data;
	}
	
}
class StrategyThree implements ListConverter{

	@Override
	public String ListToString(List structure) {
		//joka kolmas rivinvaihto get metodi
		String data="";
		for(int i =0;i<structure.size();i++) {
			if(i%3==0 && i>0) {
				data+="\n"+structure.get(i)+" ";
			}else {
			data+=structure.get(i)+" ";
			}
		}
		return data;
	}
	
}

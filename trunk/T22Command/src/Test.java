
public class Test {

	public static void main(String[] args) {
		//reciever
		ValkoKangas vlk=new ValkoKangas();
		//Commands
		Command yl�s=new ValkoKangasYl�s(vlk);
		Command alas=new ValkoKangasAlas(vlk);
		//inovker
		Sein�Painike buttoni1=new Sein�Painike(alas);
		Sein�Painike buttoni2=new Sein�Painike(yl�s);
		buttoni1.paina();
		buttoni2.paina();

	}

}

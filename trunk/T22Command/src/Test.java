
public class Test {

	public static void main(String[] args) {
		//reciever
		ValkoKangas vlk=new ValkoKangas();
		//Commands
		Command ylös=new ValkoKangasYlös(vlk);
		Command alas=new ValkoKangasAlas(vlk);
		//inovker
		SeinäPainike buttoni1=new SeinäPainike(alas);
		SeinäPainike buttoni2=new SeinäPainike(ylös);
		buttoni1.paina();
		buttoni2.paina();

	}

}

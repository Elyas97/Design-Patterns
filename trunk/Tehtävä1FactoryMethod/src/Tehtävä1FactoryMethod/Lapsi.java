package Teht�v�1FactoryMethod;

public class Lapsi extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		// TODO Auto-generated method stub
		 return new Maito();
	}

}

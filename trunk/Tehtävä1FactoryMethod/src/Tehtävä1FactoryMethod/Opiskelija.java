package Teht�v�1FactoryMethod;

public class Opiskelija extends AterioivaOtus {

	@Override
	public Juoma createJuoma() {
		return new Limu();
	}

}


public class Charmeleon implements PokemonState {
	PokemonContext t;
	public Charmeleon(PokemonContext t) {
		this.t=t;
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		t.lisääPiste(1);
		if(t.getPisteet()>10) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

	@Override
	public void lennä() {
		System.out.println(this.getClass().getName()+ " ei osaa lentää");
		if(t.getPisteet()>10) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
	}

	@Override
	public void hyökkää() {
		System.out.println(this.getClass().getName()+ " hyökkää");
		if(t.getPisteet()>10) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

}

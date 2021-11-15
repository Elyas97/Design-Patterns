
public class Charmander implements PokemonState {
	PokemonContext t;
	public Charmander(PokemonContext t) {
		this.t=t;
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		t.lisääPiste(1);
		if(t.getPisteet()>5) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
		
	}

	@Override
	public void lennä() {
		System.out.println(this.getClass().getName()+ " ei osaa lentää");
		t.lisääPiste(1);
		if(t.getPisteet()>5) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
		
	}

	@Override
	public void hyökkää() {
		System.out.println(this.getClass().getName()+ " hyökkää");
		t.lisääPiste(1);
		if(t.getPisteet()>5) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
	}

}

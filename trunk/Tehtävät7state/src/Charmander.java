
public class Charmander implements PokemonState {
	PokemonContext t;
	public Charmander(PokemonContext t) {
		this.t=t;
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		t.lis��Piste(1);
		if(t.getPisteet()>5) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
		
	}

	@Override
	public void lenn�() {
		System.out.println(this.getClass().getName()+ " ei osaa lent��");
		t.lis��Piste(1);
		if(t.getPisteet()>5) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
		
	}

	@Override
	public void hy�kk��() {
		System.out.println(this.getClass().getName()+ " hy�kk��");
		t.lis��Piste(1);
		if(t.getPisteet()>5) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
	}

}

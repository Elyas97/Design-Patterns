
public class Charmeleon implements PokemonState {
	PokemonContext t;
	public Charmeleon(PokemonContext t) {
		this.t=t;
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		t.lis��Piste(1);
		if(t.getPisteet()>10) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

	@Override
	public void lenn�() {
		System.out.println(this.getClass().getName()+ " ei osaa lent��");
		if(t.getPisteet()>10) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
	}

	@Override
	public void hy�kk��() {
		System.out.println(this.getClass().getName()+ " hy�kk��");
		if(t.getPisteet()>10) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

}

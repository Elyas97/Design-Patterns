
public class Charizard implements PokemonState {
	PokemonContext t;
	public Charizard(PokemonContext t) {
		this.t=t;
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		
	}

	@Override
	public void lenn�() {
		System.out.println(this.getClass().getName()+ " Lent�� korkealle");
		
	}

	@Override
	public void hy�kk��() {
		System.out.println(this.getClass().getName()+ " hy�kk�� ilmasta");
		
	}

}

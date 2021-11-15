
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
	public void lennä() {
		System.out.println(this.getClass().getName()+ " Lentää korkealle");
		
	}

	@Override
	public void hyökkää() {
		System.out.println(this.getClass().getName()+ " hyökkää ilmasta");
		
	}

}


public class PokemonContext {
	private PokemonState state;
	private PokemonState charmander;
	private PokemonState charmeleon;
	private PokemonState charizard;
	private int pisteet;

	public PokemonContext() {
		charmander = new Charmander(this);
		charmeleon = new Charmeleon(this);
		charizard = new Charizard(this);
		pisteet = 0;
		this.state = charmander;
	}

	public void vaihdaState(PokemonState state) {
		this.state = state;
	}

	public void juokse() {
		state.juokse();
	}

	public void lenn�() {
		state.lenn�();
	};

	public void hy�kk��() {
		state.hy�kk��();
	};

	protected int getPisteet() {
		return pisteet;
	}

	protected void lis��Piste(int piste) {
		pisteet = pisteet + piste;
	}

	public PokemonState getCharmander() {
		return charmander;
	}

	public PokemonState getCharmeleon() {
		return charmeleon;
	}

	public PokemonState getCharizard() {
		return charizard;
	}

}

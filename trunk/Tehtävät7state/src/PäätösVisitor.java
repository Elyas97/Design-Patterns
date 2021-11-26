
public class P��t�sVisitor implements Visitor {
	PokemonContext p;
	public P��t�sVisitor(PokemonContext p) {
		this.p=p;
	}

	@Override
	public boolean visit(Charizard c) {
		return false;
	}

	@Override
	public boolean visit(Charmander c) {
		if(p.getPisteet()>5) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean visit(Charmeleon c) {
		if(p.getPisteet()>10) {
			return true;
		}else {
			return false;
		}
	}

}

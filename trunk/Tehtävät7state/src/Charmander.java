
public class Charmander implements PokemonState {
	PokemonContext t;
	P‰‰tˆsVisitor vis;
	public Charmander(PokemonContext t) {
		this.t=t;
		vis=new P‰‰tˆsVisitor(t);
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		t.lis‰‰Piste(1);
		if(vis.visit(this)==true) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
		
	}

	@Override
	public void lenn‰() {
		System.out.println(this.getClass().getName()+ " ei osaa lent‰‰");
		t.lis‰‰Piste(1);
		if(vis.visit(this)==true) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
		
	}

	@Override
	public void hyˆkk‰‰() {
		System.out.println(this.getClass().getName()+ " hyˆkk‰‰");
		t.lis‰‰Piste(1);
		if(vis.visit(this)==true) {
			System.out.println("Charmander kehittyi Charmeleoniksi");
			t.vaihdaState(t.getCharmeleon());
		}
	}

}

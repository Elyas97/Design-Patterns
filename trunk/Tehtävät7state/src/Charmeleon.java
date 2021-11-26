
public class Charmeleon implements PokemonState {
	PokemonContext t;
	P��t�sVisitor vis;
	public Charmeleon(PokemonContext t) {
		this.t=t;
		vis=new P��t�sVisitor(t);
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		t.lis��Piste(1);
		if(vis.visit(this)==true) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

	@Override
	public void lenn�() {
		System.out.println(this.getClass().getName()+ " ei osaa lent��");
		if(vis.visit(this)==true) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
	}

	@Override
	public void hy�kk��() {
		System.out.println(this.getClass().getName()+ " hy�kk��");
		if(vis.visit(this)==true) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

}

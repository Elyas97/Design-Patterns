
public class Charmeleon implements PokemonState {
	PokemonContext t;
	PäätösVisitor vis;
	public Charmeleon(PokemonContext t) {
		this.t=t;
		vis=new PäätösVisitor(t);
	}

	@Override
	public void juokse() {
		System.out.println(this.getClass().getName()+ " Juoksee");
		t.lisääPiste(1);
		if(vis.visit(this)==true) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

	@Override
	public void lennä() {
		System.out.println(this.getClass().getName()+ " ei osaa lentää");
		if(vis.visit(this)==true) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
	}

	@Override
	public void hyökkää() {
		System.out.println(this.getClass().getName()+ " hyökkää");
		if(vis.visit(this)==true) {
			System.out.println("Charmeleon kehittyi Charizardiksi");
			t.vaihdaState(t.getCharizard());
		}
		
	}

}

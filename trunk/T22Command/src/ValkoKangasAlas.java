
public class ValkoKangasAlas implements Command {
	ValkoKangas k;
public ValkoKangasAlas(ValkoKangas k) {
	this.k=k;
}
@Override
public void execute() {
	k.alas();
}

}

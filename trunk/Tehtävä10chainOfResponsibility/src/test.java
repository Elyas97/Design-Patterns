
public class test {
 public static void main(String[] args) {
	 Manager manageri=new Manager();
	 Director direktori=new Director();
	 CEO johtaja=new CEO();
	 manageri.setSuccessor(direktori);
	 direktori.setSuccessor(johtaja);
	
	 for(int i=1;i<=51;i++) {
		 Raise ty�ntekij�=new Raise(i);
		 manageri.handle(ty�ntekij�);
	 }
 }
}


public class Asiakas extends Thread {
	public  boolean Pelaa=true;
	private Arvuuttaja ar;
	private  Object obj;
	public Asiakas(Arvuuttaja ar) {
		this.ar=ar;
	}
	public synchronized void  liityPeliin() {
		this.obj=ar.liityPeliin(this);
	}
	public synchronized boolean arvaa(int numero) {
		boolean temp=ar.arvaa(numero,this,this.obj);
		return temp;
	}
	
 public void run() {
	 while(Pelaa==true) {
		 int numero=(int) (Math.random()*3);
		 boolean temp=arvaa(numero);
		 if(temp==true) {
			 Pelaa=false;
			 break;
			
		 }
	 }
 }
 
}

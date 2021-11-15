import java.util.Scanner;

public class Kivipeli extends Game {
	boolean pelaa;
	
	Scanner scan;
	String valinta;
	String konevalinta;
	int pelaajapiste;
	int tietokonepiste;
	@Override
	void initializeGame() {
		pelaa=false;
		scan=new Scanner(System.in);
		
}

	@Override
	void makePlay(int player) {
		System.out.println("Enter your move rock,paper or scissors. End game by entering quit");
		//tietokone kivi sakset paperi;
		int random=(int) (Math.random()*3);
		if(random==0) {
			konevalinta="rock";
		}else if(random==1) {
			konevalinta="scissors";
		}else {konevalinta="paper";}
		valinta=scan.nextLine();
		
		if(valinta.equalsIgnoreCase("quit")){
			pelaa=true;
			return;
		} else if(valinta.equalsIgnoreCase("rock")==false && valinta.equalsIgnoreCase("paper")==false && valinta.equalsIgnoreCase("scissors")==false) {
			System.out.println("Kirjoita uudestaan " + valinta.equalsIgnoreCase("rock"));
			return;
		}
		if(valinta.equalsIgnoreCase(konevalinta)) {
			System.out.println("Your move:" +valinta+ "\n Computer: "+konevalinta+"\n Its a draw!" );
		}else if(valinta.equalsIgnoreCase("rock") && konevalinta.equalsIgnoreCase("scissors")
				|| valinta.equalsIgnoreCase("paper") && konevalinta.equalsIgnoreCase("rock")
				|| valinta.equalsIgnoreCase("scissors") && konevalinta.equalsIgnoreCase("paper") )
		{
			System.out.println("Your move:" +valinta+ "\n Computer:"+konevalinta+"\n +You won +1 point!" );
			pelaajapiste++;
		}else {
			System.out.println("Your move:" +valinta+ "\n Computer: "+konevalinta+"\n Computer won +1 point!" );
			tietokonepiste++;
		}
		
	}

	@Override
	boolean endOfGame() {
		if(pelaa==false) {
			return false;
		}else {
		return true;
		}
	}

	@Override
	void printWinner() {
		if(tietokonepiste>pelaajapiste) {
			System.out.println("Computer won. \n Computers points:" +tietokonepiste+"\n Sinun pisteet:"+pelaajapiste);
		}else if(tietokonepiste<pelaajapiste) {
			System.out.println("You won! \n Computers points:" +tietokonepiste+"\n Sinun pisteet:"+pelaajapiste);
		}else {
			System.out.println("its a draw! \n Computers points:" +tietokonepiste+"\n Sinun pisteet:"+pelaajapiste); 
		}
		
	}

}

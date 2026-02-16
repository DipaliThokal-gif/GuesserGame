package GuesserGame;



public class App {

	public static void main(String[] args) {
		System.out.println("--------- Game Start -------- ");
		Umpire UM = new Umpire();
		UM.CollectNumFromGuesser();
		UM.CollectNumFromPlayers();
		UM.Compare();
		System.out.println("----- Game Over--------");
		

	}

}
package GuesserGame;

class Umpire{
	int Guessernum;
	int Playernum1;
	int Playernum2;
	int Playernum3;
	
	public void CollectNumFromGuesser() {
		Guesser Gu = new Guesser();
		Guessernum=Gu.guesserNumb();
	}
	public void CollectNumFromPlayers() {
		
		
		System.out.println("Player1 guess your number.");
		Player p1 = new Player();
		Playernum1=p1.PlayerNumb();
		
		
		System.out.println("Player2 guess your number.");
		Player p2 = new Player();
		Playernum2=p2.PlayerNumb();
		
		
		System.out.println("Player3 guess your number.");
		Player p3 = new Player();
		Playernum3=p3.PlayerNumb();
		}
	public void Compare() {
		
		
		
		if(Guessernum == Playernum1 ) {
			if(Guessernum == Playernum2 && Guessernum== Playernum3  ) {
				System.out.println("All players won the game !!!");
			}
			else if(Guessernum == Playernum2) {
				System.out.println("Player 1 and Player2 won the game !!!");
			}
			else if(Guessernum == Playernum3) {
				System.out.println("Player 1 and Player3 won the game !!!");
			}
			else System.out.println("Player1 won the game !!!");
			
		}
		else if(Guessernum == Playernum2 ) {
			if(Guessernum == Playernum3) {
				System.out.println("Player2 and Player3 won the match!!!");
			}
			else System.out.println("Player 2 won the match!!!");
		}
		else if(Guessernum == Playernum3) {
			System.out.println("Only player3 won the game !!");
		}
		else {
			System.out.println("All player lost the game!!!");
		}
	}
}


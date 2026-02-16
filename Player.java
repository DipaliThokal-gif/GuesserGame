package GuesserGame;
import java.util.Scanner;

class Player{
	
	int PlayerNum;
	public int PlayerNumb(){
		Scanner scan = new Scanner(System.in);
		PlayerNum = scan.nextInt();
		return PlayerNum;
		
	}
}

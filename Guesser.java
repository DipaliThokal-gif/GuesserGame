package GuesserGame;
import java.util.Scanner;
class Guesser{
	int GuesserNum;
	public int guesserNumb(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Guesser kindly guess a number : ");
		GuesserNum = scan.nextInt();
		return GuesserNum;
		
	}
}
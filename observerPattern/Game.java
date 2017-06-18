package observerPattern;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

	private Player p1;
	private Player p2;
	private int winsRequired;
	public static Scanner scanner = new Scanner(System.in);


	public Game(){
		this.p1 = getNewPlayer(1);
		this.p2 = getNewPlayer(2);
		this.winsRequired = 3;
	}
	
	private int getPlayerType(int number){
		int choice = -1;
		while (choice < 1 || choice > 2) {
			try  {
				System.out.println("Enter Type for Player " + number+": ");
				System.out.println("\t1 - Human");
				System.out.println("\t2 - Computer");
				choice = scanner.nextInt();
			} catch (InputMismatchException | IllegalStateException e) {
				System.out.println("Please enter an integer");
			}
		}
		return choice;
	}
	
	public Player getNewPlayer(int number) {
		if (getPlayerType(number) == 1) {
			return new HumanPlayer(number);
		} else {
			return new ComputerPlayer(number);
		}
	}

	private boolean isGameFinished(){
		if (p1.getWins() == this.winsRequired){
			System.out.println("Player 1 wins game!");
			return true;
		} else if (p2.getWins() == this.winsRequired){
			System.out.println("Player 2 wins game!");
			return true;
		}
		return false;
	}
	
	public void run() {
	    //create a new info packet
		InfoPacket observerNotification = new InfoPacket();
        //create observer list and add one observer
        List<Observer> observers = new ArrayList<>();
        observers.add(new Observer());

		while(!isGameFinished()){
			Option o1 = p1.getChoice();
			Option o2 = p2.getChoice();
			System.out.println(o1.name() + " vs. " + o2.name());
			if (o1.beats(o2)){
				p1.addWin();
				observerNotification.addToP1Wins(1);
				System.out.println("Player 1 wins round!");
			} else if (o2.beats(o1)){
				p2.addWin();
				observerNotification.addToP2Wins(1);
				System.out.println("Player 2 wins round!");
			} else {
				System.out.println("Draw!");
				observerNotification.addToDraws(1);
			}
			System.out.println("-----");
			observerNotification.addToRoundsPlayed(1);

            //push infopacket to observers in List<Observers>:
            for(Observer observer: observers){
                observer.update(observerNotification);
            }
		}
	}
	
	public static void main(String args[]) {
		new Game().run();
	}
}

package observerPattern;

/**
 * Created by qngapparat on 18.06.17.
 */
public class Observer {

    public Observer(){

    }

    public void update(InfoPacket packet){
        System.out.println("***** statBot *****");
        System.out.println("Rounds played: " + packet.getRoundsPlayed());
        System.out.println("player 1 wins: " + packet.getp1Wins());
        System.out.println("player 2 wins: " + packet.getp2Wins());
        System.out.println("Draws: " + packet.getDraws());
        System.out.println("********************");
    }
}

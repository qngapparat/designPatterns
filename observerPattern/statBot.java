package observerPattern;
import javax.sound.midi.MidiDevice;
import java.util.Observable;
import java.util.Observer;
import java.util.Observable;

/**
 * Created by qngapparat on 18.06.17.
 */
public class statBot implements Observer{

    public statBot(){

    }



    public void update(Observable o, Object arg) {

        InfoPacket packet = (InfoPacket) o;
        System.out.println("***** statBot *****");
        System.out.println("Rounds played: " + packet.getRoundsPlayed());
        System.out.println("player 1 wins: " + packet.getp1Wins());
        System.out.println("player 2 wins: " + packet.getp2Wins());
        System.out.println("Draws: " + packet.getDraws());
        System.out.println("********************");
    }
}

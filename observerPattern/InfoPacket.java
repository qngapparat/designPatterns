package observerPattern;

import java.util.Observable;

/**
 * Created by qngapparat on 18.06.17.
 */
public class InfoPacket extends Observable{

    private int p1Wins;
    private int p2Wins;
    private int roundsPlayed;
    private int draws;

    public InfoPacket(){

    }

    public void addToP1Wins(int wins){
        this.p1Wins += wins;
        setChanged();
    }

    public void addToP2Wins(int wins){
        this.p2Wins += wins;
        setChanged();
    }

    public void addToRoundsPlayed(int roundsPlayed){
        this.roundsPlayed += roundsPlayed;
        setChanged();
    }

    public void addToDraws(int draws){
        this.draws += draws;
        setChanged();
    }


    public int getp1Wins(){
        return this.p1Wins;
    }

    public int getp2Wins(){
        return this.p2Wins;

    }

    public int getRoundsPlayed(){
        return this.roundsPlayed;
    }

    public int getDraws(){
        return this.draws;
    }


}

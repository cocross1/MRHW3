import java.util.*;



public class PowderBot implements RoShamBot{

    private ArrayList<Action> opMoves;
    private ArrayList<Action> myMoves;
    public PowderBot()
    {
        opMoves = new ArrayList<Action>();
        myMoves = new ArrayList<Action>();
    }

    /*
     * Helper class to keep track of Markov model.
     */
    private static class Markov{

    }

    public Action getNextMove(Action opLastMove){
        Action act = null;
        opMoves.add(opLastMove);



        myMoves.add(act);
        return act;
    }

    private Action randomGuess()
    {

    }

    private Action freqAnalysis()
    {

    }

    private Action historyMatch()
    {

    }
    
}

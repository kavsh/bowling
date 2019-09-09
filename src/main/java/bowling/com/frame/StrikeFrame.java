package bowling.com.frame;

public class StrikeFrame extends Frame {

    private static final int SCORE = 10;

    public StrikeFrame(char strike) {
        super(strike);
    }

    @Override
    public boolean isStrike() {
        return true;
    }

    @Override
    public int getScore() {
        return SCORE;
    }
}

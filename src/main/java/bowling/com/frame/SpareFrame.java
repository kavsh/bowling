package bowling.com.frame;

public class SpareFrame extends Frame{
    private static final int SCORE = 10;

    public SpareFrame(char firstTry, char secondTry) {
        super(firstTry, secondTry);
    }

    @Override
    public boolean isSpare() {
        return true;
    }

    @Override
    public int getScore() {
        return SCORE;
    }

}

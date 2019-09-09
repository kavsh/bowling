package bowling.com.roll;

public class Roll implements IRoll{

    private int score = 0;

    public Roll(char numOfKnockedPins) {
        switch(numOfKnockedPins) {
            case MISS:
                score = 0;
                break;
            case SPARE:
            case STRIKE:
                score = 10;
                break;
            default:
                score = Character.getNumericValue(numOfKnockedPins);
        }
    }

    public int getScore() {
        return score;
    }

}

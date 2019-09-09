package bowling.com.frame;

import bowling.com.roll.Roll;
import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class Frame implements IFrame{
    private final @NotNull
    Roll firstRoll;
    private final @NotNull Roll secondRoll;

    public Frame(char firstTry, @Nullable char secondTry) {
        firstRoll = new Roll(firstTry);
        secondRoll = new Roll(secondTry);
    }

    public Frame(char strike) {
        firstRoll = new Roll(strike);
        secondRoll = new Roll('-');
    }

    public int getScore() {
        return firstRoll.getScore() + secondRoll.getScore();
    }

    public int getFirstRollScore() {
        return firstRoll.getScore();
    }

    public int getSecondRollScore() {
        return secondRoll.getScore();
    }

    public boolean isStrike() {
        return false;
    }

    public boolean isSpare() {
        return false;
    }
}
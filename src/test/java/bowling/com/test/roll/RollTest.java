package bowling.com.test.roll;

import bowling.com.roll.Roll;
import org.junit.Assert;
import org.junit.Test;

public class RollTest {
    private Roll roll;

    @Test
    public void should_score_10_with_strike() {
        roll = new Roll('X');
        Assert.assertEquals(10, roll.getScore());
    }

    @Test
    public void should_score_10_with_spare() {
        roll = new Roll('/');
        Assert.assertEquals(10, roll.getScore());
    }

    @Test
    public void should_score_0_with_dash() {
        roll = new Roll('-');
        Assert.assertEquals(0, roll.getScore());
    }

    @Test
    public void should_score_five_with_input_five() {
        roll = new Roll('5');
        Assert.assertEquals(5, roll.getScore());
    }
}

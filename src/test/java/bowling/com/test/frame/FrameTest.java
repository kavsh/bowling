package bowling.com.test.frame;

import bowling.com.frame.Frame;
import org.junit.Assert;
import org.junit.Test;

public class FrameTest {

    @Test
    public void should_score_10_when_strike() {
        Frame frame = new Frame('X');
        Assert.assertEquals(10, frame.getScore());
    }

    @Test
    public void should_score_0_when_dash() {
        Frame frame = new Frame('-','-');
        Assert.assertEquals(0, frame.getScore());
    }

    @Test
    public void should_score_nine_as_firstRoll_is_nine() {
        Frame frame = new Frame('9', '1');
        Assert.assertEquals(9, frame.getFirstRollScore());
    }

    @Test
    public void should_not_be_strike() {
        Frame frame = new Frame('9', '1');
        Assert.assertFalse(frame.isStrike());
    }

    @Test
    public void should_not_be_spare() {
        Frame frame = new Frame('9', '1');
        Assert.assertFalse(frame.isSpare());
    }

}

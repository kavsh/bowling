package bowling.com.test.frame;

import bowling.com.frame.Frame;
import bowling.com.frame.StrikeFrame;
import org.junit.Assert;
import org.junit.Test;

public class StrikeFrameTest {

    @Test
    public void should_score_10() {
        Frame frame = new StrikeFrame('X');
        Assert.assertEquals(10, frame.getScore());
    }

    @Test
    public void should_be_strike() {
        Frame frame = new StrikeFrame('X');
        Assert.assertTrue(frame.isStrike());
    }
}

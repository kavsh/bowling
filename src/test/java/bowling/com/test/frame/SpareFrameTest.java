package bowling.com.test.frame;

import bowling.com.frame.Frame;
import bowling.com.frame.SpareFrame;
import org.junit.Assert;
import org.junit.Test;

public class SpareFrameTest {

    @Test
    public void should_score_10() {
        Frame frame = new Frame('-','/');
        Assert.assertEquals(10, frame.getScore());
    }

    @Test
    public void should_be_spare() {
        Frame frame = new SpareFrame('1','/');
        Assert.assertTrue(frame.isSpare());
    }
}

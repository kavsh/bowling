package bowling.com.test.game;

import bowling.com.frame.Frame;
import bowling.com.frame.StrikeFrame;
import bowling.com.game.Game;
import bowling.com.frame.SpareFrame;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class GameTest {
    private ArrayList<Frame> frames;
    private Game game;

    @Before
    public void setUp() {
        frames = new ArrayList<>();
    }

    @Test
    public void score_30_for_position_eight_when_all_strike() {
        for(int pos = 0; pos < 12 ; pos++) {
            frames.add(new StrikeFrame('X'));
        }
        game = new Game(frames);
        Assert.assertEquals(30, game.calculateOneFrameScore(frames, 8));
    }

    @Test
    public void score_300_when_all_strike() {
        for(int pos = 0; pos < 12 ; pos++) {
            frames.add(new StrikeFrame('X'));
        }
        game = new Game(frames);
        Assert.assertEquals(300, game.getTotalScore());
    }

    @Test
    public void score_300_when_all_spare() {
        for(int pos = 0; pos < 11 ; pos++) {
            frames.add(new SpareFrame('1', '/'));
        }
        game = new Game(frames);
        Assert.assertEquals(110, game.getTotalScore());
    }

    @Test
    public void score_90_when_even_rolls_throw_nine_pin() {
        for(int pos = 0; pos < 10 ; pos++) {
            frames.add(new Frame('9', '-'));
        }
        game = new Game(frames);
        Assert.assertEquals(90, game.getTotalScore());
    }

    @Test
    public void score_20_when_all_rolls_throw_one_pin() {
        for(int pos = 0; pos < 10 ; pos++) {
            frames.add(new Frame('1', '1'));
        }
        game = new Game(frames);
        Assert.assertEquals(20, game.getTotalScore());
    }
}

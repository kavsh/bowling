package bowling.com.game;

import bowling.com.frame.Frame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Game {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    private static final int NUMBER_OF_TURNS = 10;
    private final ArrayList<Frame> frames;

    public Game(ArrayList<Frame> frames) {
        this.frames = frames;
    }

    public int getTotalScore() {
        List<Integer> totalScoreList = IntStream.range(0, NUMBER_OF_TURNS).mapToObj(i -> calculateOneFrameScore(frames,i)).collect(Collectors.toList());
        log.info("Total score:" +  totalScoreList.stream().mapToInt(Integer::intValue).sum());
        return totalScoreList.stream().mapToInt(Integer::intValue).sum();
    }

    public int calculateOneFrameScore(ArrayList<Frame> frames, int pos) {
        if (frames.get(pos).isStrike()) {
                int firstRollScore = frames.get(pos+1).isSpare() ? 0 : frames.get(pos+1).getFirstRollScore();
                int secondRollScore =  frames.get(pos+1).isStrike() ?
                        frames.get(pos+2).getFirstRollScore() :
                        frames.get(pos+1).getSecondRollScore() ;

                return frames.get(pos).getScore() + firstRollScore + secondRollScore;
        }
        else {
            if (frames.get(pos).isSpare()) {
                return frames.get(pos).getSecondRollScore() + frames.get(pos + 1).getFirstRollScore();
            }
        }
        return frames.get(pos).getScore();
    }
}

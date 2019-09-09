package bowling.com.main;

import bowling.com.frame.Frame;
import bowling.com.frame.StrikeFrame;
import bowling.com.game.Game;
import bowling.com.frame.SpareFrame;
import com.sun.istack.internal.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    private final static char SPARE = '/';
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        log.info("Write in input for each frame, seperate with space:");
        @NotNull String inputString = sc.nextLine();
        List<String> frameList = Arrays.asList(inputString.split("\\s"));

        if (frameList.size() < 10) {
            log.info("At least 10 frames should be given!");
            System.exit(1);
        }

        List<Frame> frames = frameList.stream()
                .map(x ->
                    x.length() == 1 ? new StrikeFrame(x.charAt(0)) : x.charAt(1) == SPARE ?
                            new SpareFrame(x.charAt(0), x.charAt(1)) :
                            new Frame(x.charAt(0), x.charAt(1)))
                .collect(Collectors.toList());

        Game game = new Game((ArrayList<Frame>) frames);
        game.getTotalScore();
    }
}

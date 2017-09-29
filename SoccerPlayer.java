/**
 * Represents a soccer player that can shoot goals
 * @author xwu319
 * @version 1.0
 */
public class SoccerPlayer extends Athlete {
    private boolean canScoreGoal;

    /**
     * Public constructor.
     *
     * @param name the name of the soccer player.
     * @param canScoreGoal whether or not the Player can score goal.
     * @param isACheater if this the soccer player is a cheater or not.
     */
    public SoccerPlayer(String name, boolean canScoreGoal, boolean isACheater) {
        super(name, isACheater);
        this.canScoreGoal = canScoreGoal;
    }

    /**
     * @return whether or not this soccer player is good at soccer.
     */
    public boolean getCanScoreGoal() {
        return this.canScoreGoal;
    }

    /**
     * Has the soccer player shoot for a goal.
     */
    @Override
    public void play() {
        System.out.println(String.format("%s shoots and %s!",
            getName(), canScoreGoal ? "scores" : "misses"));
    }
}

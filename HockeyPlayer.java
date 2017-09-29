/**
 * Represents a hockey player that can hit a ball with certain force
 *
 * @author xwu319
 * @version 1.0
 */
public class HockeyPlayer extends Athlete {
    private int hitForce;

    /**
     * Public constructor.
     *
     * @param name the name of the hockey player.
     * @param hitForce the force that the player hit the ball with
     * @param isACheater if this the hockey player is a cheater or not.
     */
    public HockeyPlayer(String name, int hitForce, boolean isACheater) {
        super(name, isACheater);
        this.hitForce = hitForce;
    }

    /**
     * @return the hitForce of the player.
     */
    public int getHitForce() {
        return hitForce;
    }

    @Override
    /**
     * Let the hockey player hit the ball
     */
    public void play() {
        System.out.println(String.format("%s hits the ball with hockey with the"
            + " force %d newton!", getName(), this.hitForce));
    }
}

/**
 * Represents a tennis player
 *
 * @author xwu319
 * @version 1.0
 */
public class TennisPlayer extends Athlete {
    private int serveSpeed;

    /**
     * Public constructor.
     *
     * @param name the name of the tennis player.
     * @param serveSpeed the speed that the tennis player can serve.
     * @param isACheater if this the tennis player is a cheater or not.
     */
    public TennisPlayer(String name, int serveSpeed, boolean isACheater) {
        super(name, isACheater);
        this.serveSpeed = serveSpeed;
    }

    /**
     * @return the tennis serve speed of this tennis player.
     */
    public int getServeSpeed() {
        return this.serveSpeed;
    }

    /**
     * Has the tennis player serve a tennis ball.
     */
    @Override
    public void play() {
        System.out.println(String.format("%s serves the ball at %dmph!",
            getName(), this.serveSpeed));
    }
}

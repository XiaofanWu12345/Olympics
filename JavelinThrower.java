/**
 * Represents a javelin thrower that can throw a javelin
 *
 * @author xwu319
 * @version 1.0
 */
public class JavelinThrower extends Athlete {
    private double javelinDamage;

    /**
     * Public constructor.
     *
     * @param name the name of the javelin thrower.
     * @param javelinDamage the damage that the javelin suffers.
     * @param isACheater if this the javelin thrower is a cheater or not.
     */
    public JavelinThrower(String name, double javelinDamage,
            boolean isACheater) {
        super(name, isACheater);
        this.javelinDamage = javelinDamage;
    }

    /**
     * @return the damage this athlete's javelin inflicts.
     */
    public double getJavelinDamage() {
        return this.javelinDamage;
    }

    /**
     * Has the Javelin Throwers throw their javelin.
     */
    @Override
    public void play() {
        System.out.println(String.format("%s throws the javelin and inflicts"
            + " %f damage!", getName(), this.javelinDamage));
    }
}

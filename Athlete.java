/**
 * Represents an Athlete that can play sports at the Olympics!
 * The original implementation violates the Single responsibility Principle. A
 * single class Athlete is performing more than one task. My refactoring makes
 * the class simpler and create subclasses that extend this class to perform
 * additional specific functions for each sub-class.
 * @author xwu319
 * @version 1.0
 */
public class Athlete {
    private int hunger;
    private String name;
    private boolean isACheater;

    /**
     * Public constructor.
     *
     * @param name the name of the athlete.
     * @param isACheater if this athlete is a cheater or not.
     */
    public Athlete(String name, boolean isACheater) {
        this.hunger = 0;
        this.name = name;
        this.isACheater = isACheater;
    }

    /**
     * @return the hunger of this athlete.
     */
    public int getHunger() {
        return this.hunger;
    }

    /**
     * @return the name of this athlete.
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return whether or not this athlete is a cheater.
     */
    public boolean getIsACheater() {
        return this.isACheater;
    }

    /**
     * Has the athlete exercise. Will make the athlete hungry by increasing
     * their hunger by the number of pushups.
     *
     * @param numberOfPushups the number of pushups the athlete should do.
     */
    public void exercise(int numberOfPushups) {
        System.out.println(String.format("%s does %d pushups and works up"
            + " quite an appetite!", getName(), numberOfPushups));
        this.hunger += numberOfPushups;
    }

    /**
     * Has the athlete eat some food to decrease their hunger by foodAmount.
     *
     * @param foodAmount how much to decrease hunger by.
     * @param foodType the type of food the athlete eats.
     */
    public void eat(int foodAmount, String foodType) {
        System.out.println(String.format("%s eats %d of the %s!",
            getName(), foodAmount, foodType));
        this.hunger = Math.max(this.hunger - foodAmount, 0);
    }

    /**
     * Has the athlete play something.
     */
    public void play() {
        System.out.println(String.format("%s can't play a sport!",
            getName()));
    }
}

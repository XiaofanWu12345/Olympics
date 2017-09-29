/**
 * Represents a feeder that feed athletes
 * @author xwu319
 * @version 1.0
 */
public class Feeder extends EventManager {
    private boolean hasGroceries;
    private String[] food = {"Stew", "Fish", "Steak", "Chicken", "Veggies"};
    private int nextFood;

    /**
     * Makes a group of athletes eat.
     * @param athletes the group of athletes
     */
    public void feedAthletes(Athlete... athletes) {
        if (hasGroceries) {
            for (Athlete athlete : athletes) {
                athlete.eat(10, chooseFood());
            }
            hasGroceries = false;
        } else {
            System.out.println("Can't feed them without groceries!");
            driveToGroceryStore();
            feedAthletes(athletes);
        }
    }

    /**
     * Gets the groceries to cook for the athletes.
     */
    private void driveToGroceryStore() {
        System.out.println("Time to get some groceries!");
        this.hasGroceries = true;
    }

    /**
     * @return the next food item to feed the athletes.
     */
    private String chooseFood() {
        return food[(nextFood++) % food.length];
    }
}

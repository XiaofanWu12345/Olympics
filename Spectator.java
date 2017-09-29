/**
 * Represents a spectator at the Olympics.
 *
 * The origianl Spectator class's setFavoriteAthlete method is public, which
 * means it can be accessed by any class, including Spectator's subclass
 * SuperFan. Since we don't want the class SuperFan be able to change its
 * Favorite Athlete, we make the setFavoriteAthlete method private in Spectator
 * so that other classes, including SuperFan, cannot access this method.
 *
 * Also I delete the override method setFavoriteAthlete in SuperFan because it
 * relaxes the post condition of this method and provides less than the method
 * in superclass Spectator.
 * @author xwu319
 * @version 1.0
 */
public class Spectator {
    private Athlete favoriteAthlete;

    /**
     * Public constructor.
     *
     * @param favoriteAthlete this spectator's favorite athlete... for now...
     */
    public Spectator(Athlete favoriteAthlete) {
        this.favoriteAthlete = favoriteAthlete;
    }

    /**
     * Prints out a cheer for this spectator's favorite athlete!
     */
    public void cheerForFavorite() {
        System.out.println("Yay! Go " + favoriteAthlete.getName() + "!");
    }

    /**
     * Sets the new favorite athlete of this spectator.
     *
     * @param favoriteAthlete this spectator's favorite athlete... for now...
     */
    private void setFavoriteAthlete(Athlete favoriteAthlete) {
        this.favoriteAthlete = favoriteAthlete;
    }

    /**
     * @return this spectator's favorite athlete... for now...
     */
    public Athlete getFavoriteAthlete() {
        return this.favoriteAthlete;
    }
}

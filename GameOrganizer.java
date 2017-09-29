/**
 * Represents a game organizer that organize games between athletes
 *
 * @author xwu319
 * @version 1.0
 */
public class GameOrganizer extends EventManager {

    /**
     * Has all of the athletes compete.
     *
     * @param athletes the athletes to play.
     */
    public void organizeGames(Athlete... athletes) {
        for (Athlete athlete : athletes) {
            playGame(athlete);
        }
    }

    /**
     * Has one athlete play a game, and prints out a message if they one or
     * lost.
     *
     * @param athlete the athlete to play.
     */
    private void playGame(Athlete athlete) {
        athlete.play();
        if (athlete.getHunger() <= 15) {
            System.out.println(athlete.getName() + " won!");
        } else {
            System.out.println(athlete.getName() + " lost!");
        }
    }
}

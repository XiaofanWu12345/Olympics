/**
 * Represents the Olympic game where athlets play their sports with spectators
 * and super fans watching and cheering
 *
 * @author xwu319
 * @version 1.0
 */
public class Olympics {
    /**
     * the main method that start the Olympic game.
     * @param args the args that take in from cmd
     */
    public static void main(String[] args) {
        Athlete[] athelteArr = new Athlete[4];
        athelteArr[0] = new TennisPlayer("Tom", 100, false);
        athelteArr[1] = new SoccerPlayer("Max", true, true);
        athelteArr[2] = new JavelinThrower("Tina", 3.14, false);
        athelteArr[3] = new HockeyPlayer("Jack", 10, true);
        for (Athlete a : athelteArr) {
            a.play();
        }
        Feeder f = new Feeder();
        f.feedAthletes(athelteArr);
        Trainer t = new Trainer();
        t.trainAthletes(athelteArr);
        Supervisor s = new Supervisor();
        s.inspectAthletes(athelteArr);
        GameOrganizer g = new GameOrganizer();
        g.organizeGames(athelteArr);

        Spectator[] specArr = new Spectator[4];
        specArr[0] = new Spectator(athelteArr[0]);
        specArr[1] = new Spectator(athelteArr[1]);
        specArr[2] = new SuperFan(athelteArr[2]);
        specArr[3] = new SuperFan(athelteArr[3]);
        for (Spectator spec : specArr) {
            spec.cheerForFavorite();
            spec.setFavoriteAthlete(athelteArr[0]);
        }
    }
}

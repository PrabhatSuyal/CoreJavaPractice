package _30_Multithreading;

public class Volatile {

    /*
    *
In multi thread with multi core Env, sometime threads can cache the value of static var, so we need volatile keyword which guarantees the value of var must be updated one.
    * */
    private static volatile int counter = 0;                                    // output is not in sequence with volatile (volatile guarantees visibility not atomicity)

    private static class Player extends Thread {
        @Override
        public void run() {
            // Simulate some game events
            for (int i = 0; i < 1000; i++) {
                // Update the counter
                /*synchronized (Game.class) {                                     // output is in sequence with synchronized (synchronized guarantees visibility and atomicity)
                    counter++;
                }*/
                counter++;                                                    // output is not in sequence without synchronized
                System.out.println("Player updated counter: " + counter);
            }
        }
    }

    public static void main(String[] args) {
        // Create multiple player threads
        Player player1 = new Player();
        Player player2 = new Player();

        player1.start();
        player2.start();
    }
}

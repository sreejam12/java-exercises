package collections;
import java.util.*;
public class HotPotatoEx {

	public static void main(String[] args) {
		String[] players = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank"}; // Example player names

        Queue<String> queue = new LinkedList<>();

        // Enqueue all players
        for (String player : players) {
            queue.offer(player);
        }

        int musicStops = 5; // Number of times the music stops
        int count = 1;

        // Simulate passing the potato until only one player remains
        while (queue.size() > 1) {
            System.out.println("Round " + count + ": Music plays...");

            // Pass the potato (dequeue and enqueue)
            for (int i = 0; i < musicStops; i++) {
                String currentPlayer = queue.poll();
                System.out.println(currentPlayer + " is passing the potato...");

                // Re-enqueue the player to simulate passing the potato
                queue.offer(currentPlayer);
            }

            // Remove the player holding the potato
            String eliminatedPlayer = queue.poll();
            System.out.println(eliminatedPlayer + " is out!");

            count++;
        }

        // Only one player remains
        String winner = queue.poll();
        System.out.println("Winner: " + winner);

	}

}

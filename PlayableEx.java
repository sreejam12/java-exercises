package interfaces;
import java.util.ArrayList;
interface Playable {
    void play();
    void pause();
    void stop();
}
class MusicPlayer implements Playable {
	 public void play() {
	        System.out.println("Music is playing.");
	    }
	 public void pause() {
	        System.out.println("Music is paused.");
	    }
	 public void stop() {
	        System.out.println("Music is stopped.");
	    }
	}
class VideoPlayer implements Playable {
	 public void play() {
	        System.out.println("Video is playing.");
	    }
	 public void pause() {
	        System.out.println("Video is paused.");
	    }
	 public void stop() {
	        System.out.println("Video is stopped.");
	    }
}

public class PlayableEx {

	public static void main(String[] args) {
		// Creating an ArrayList of Playable objects
        ArrayList<Playable> playables = new ArrayList<>();
     // Adding MusicPlayer and VideoPlayer instances to the list
        playables.add(new MusicPlayer());
        playables.add(new VideoPlayer());
        for (Playable playable : playables) {
            playable.play();
            playable.pause();
            playable.stop();
        }

	}

}
//Define an interface Playable with methods play(), pause(), and stop(). Implement this interface with classes MusicPlayer and VideoPlayer. Create an array or ArrayList of Playable objects and test polymorphic behavior by invoking play(), pause(), and stop() methods.

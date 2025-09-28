package Assignment3;

// Main.java (Demo)
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "music.vlc");
        audioPlayer.play("avi", "video.avi");
    }
}

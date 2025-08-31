package 다형성활용.ex2;

public class MediaMain {

    public static void main(String[] args) {
        Player player = new Player();

        Song song = new Song();
        player.setMedia(song);
        player.playOne();
        player.playTwice();

        Podcast podcast = new Podcast();
        player.setMedia(podcast);
        player.playOne();
    }
}

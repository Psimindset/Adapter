// Classe client démontrant l’utilisation de l’Adaptateur
public class Main {
    public static void main(String[] args) {
        MusicPlayer mp3 = new Mp3Player("Sony");
        mp3.play("song.mp3");

        MusicPlayer adapter = new MediaAdapter("2.1");
        adapter.play("movie.mp4");

        System.out.println(mp3);
        System.out.println(adapter);
    }
}
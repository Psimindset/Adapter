// Implémentation simple du lecteur MP3
public class Mp3Player implements MusicPlayer {
    private String Marque;

    public Mp3Player(String marque) { this.Marque = marque; }

    public String getMarque() { return Marque; }
    public void setMarque(String marque) { this.Marque = marque; }

    @Override
    public void play(String filename) {
        System.out.println(Marque + " Lecture fichier MP3: " + filename);
    }

    @Override
    public String toString() {
        return "Lecteur MP3 Marque='" + Marque + "'";
    }
}

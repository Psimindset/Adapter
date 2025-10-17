// Classe incompatible avec MusicPlayer — lit des fichiers MP4 et AVI
public class AdvancedMusicPlayer {
    private String version;

    public AdvancedMusicPlayer(String version) { this.version = version; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public void playMp4(String filename) {
        System.out.println("Lecteur Avancé v" + version + " Lecture MP4: " + filename);
    }

    @Override
    public String toString() {
        return " Lecteur de Musique version='" + version + "'";
    }
}

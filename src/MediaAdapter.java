// Adaptateur qui rend AdvancedMusicPlayer compatible avec MediaPlayer
public class MediaAdapter implements MusicPlayer {
    private AdvancedMusicPlayer lecteurAvancé;

    public MediaAdapter(String version) {
        this.lecteurAvancé = new AdvancedMusicPlayer(version);
    }

    public AdvancedMusicPlayer getAdvancedPlayer() { return lecteurAvancé; }
    public void setAdvancedPlayer(AdvancedMusicPlayer player) { this.lecteurAvancé = player; }

    @Override
    public void play(String filename) {
        lecteurAvancé.playMp4(filename);
    }

    @Override
    public String toString() {
        return "Adapteur Media, Lecteur Avancé =" + lecteurAvancé + "";
    }
}

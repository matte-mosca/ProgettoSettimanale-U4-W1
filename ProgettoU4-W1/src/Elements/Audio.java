package Elements;

public class Audio  extends Media {
    private int durata;
    private int volume;

    public Audio(String title, int durata, int volume) {
        super(title);
        this.durata = durata;
        this.volume = volume;
    }
}

package Elements;

public class Video extends Media {
    private int durata;
    private int volume;
    private int luce;

    public Video(String title, int durata, int volume, int luce) {
        super(title);
        this.durata = durata;
        this.volume = volume;
        this.luce = luce;


    }
}

package Elements;

import interfacce.Luce;
import interfacce.Player;
import interfacce.Volume;

public class Video extends Media implements Player, Luce, Volume {
    private int durata;
    private int volume;
    private int luce;

    public Video(String title, int durata, int volume, int luce) {
        super(title);
        this.durata = durata;
        this.volume = volume;
        this.luce = luce;


    }

    @Override
    public void aumentaLuminosita() {
        luce ++;
    }

    @Override
    public void diminuisciLuminosita() {
        luce --;

    }

    @Override
    public void Play() {
        for (int i = 0; i < durata ; i++) {
            String printLuce = new String("");
            String printVolume = new String("");
            for (int j = 0; j < volume ; j++) {
                printVolume += "!";
            }
            for (int j = 0; j < luce ; j++) {
                printLuce += "!";
            }
            System.out.println("Titolo: " +title+ ", Volume: " +printVolume+ ", Luminosità: " +printLuce);
        }
        System.out.println("Il video è finito");
    }

    @Override
    public void abbassaVolume() {
        volume ++;
    }

    @Override
    public void alzaVolume() {
        volume --;
    }
}

package Elements;

import interfacce.Player;
import interfacce.Volume;

public class Audio  extends Media implements Volume, Player {
    private int durata;
    private int volume;

    public Audio(String title, int durata, int volume) {
        super(title);
        this.durata = durata;
        this.volume = volume;
    }

    // Getter


    public int getDurata() {
        return durata;
    }

    public int getVolume() {
        return volume;
    }

    // Interfacce



    @Override
    public void abbassaVolume() {
        volume--;
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public void Play() {
        for (int i = 0; i < durata ; i++) {
            String printVolume = new String("") ;
            for (int j = 0; j < volume ; j++) {
                printVolume = "!" + printVolume;
            }
            System.out.println(printVolume);
        }




    }
}

package Elements;

import interfacce.Luce;
import interfacce.Mostra;

public class Immagini extends Media implements Mostra, Luce {
    private int luce;

    public Immagini(String title, int luce) {
        super(title);
        this.luce = luce;

    }

    @Override
    public void Show() {
        String printLuce = new String("");
        for (int i = 0; i < luce ; i++) {
            printLuce += "*";
        }
        System.out.println("Nome immagine: " + title + ", Luminosità: " + printLuce);
    }

    @Override
    public void aumentaLuminosita() {
        luce ++;
    }

    @Override
    public void diminuisciLuminosita() {
        luce --;
    }
}

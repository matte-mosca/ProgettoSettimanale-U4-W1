package Elements;


import interfacce.Luce;
import interfacce.Mostra;
import interfacce.Player;
import interfacce.Volume;

import java.util.Scanner;

public class PlayerMultimediale {
    private Media[] playlist;

    public PlayerMultimediale() {
        this.playlist = new Media[5];
    }

    public void aggiungiElemento(Media elemento, int posizione) {
        if ((posizione - 1) <= playlist.length && (posizione - 1) > 0) {
            playlist[posizione] = elemento;
        }
    }

    public void eseguiElemento(int posizione) {
        if ((posizione - 1) <= playlist.length && (posizione - 1) > 0) {
            Media elemento = playlist[posizione];
            if (elemento instanceof Player) {
                ((Player) elemento).Play();

                Scanner scanner = new Scanner(System.in);
                System.out.println("Vuoi modificare volume e luminosità? Premi v+ e v- per volume o l+ o l- per luminosità");
                String selezionato = scanner.nextLine();
                if (selezionato.equalsIgnoreCase("v+") && elemento instanceof Volume){
                    ((Volume) elemento).alzaVolume();
                }
                if (selezionato.equalsIgnoreCase("v-") && elemento instanceof Volume){
                    ((Volume) elemento).abbassaVolume();
                }
                if (selezionato.equalsIgnoreCase("l+") && elemento instanceof Luce){
                    ((Luce) elemento).aumentaLuminosita();
                }
                if (selezionato.equalsIgnoreCase("l-") && elemento instanceof Luce){
                    ((Luce) elemento).diminuisciLuminosita();;
                }



            } else if (elemento instanceof Mostra) {
                ((Mostra) elemento).Show();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Vuoi modificare la luminosità? Premi l+ per aumentare o l- per per diminuire");
                String selezionato = scanner.nextLine();

            }
        }


        
    }
}



import Elements.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Audio canzone1 = new Audio ("Sultans of Swing", 5, 3);
        Video video1 = new Video("Best of Maradona", 7, 6, 4);
        Immagini immagine1 = new Immagini("Copertina album", 6);

        canzone1.alzaVolume();
        canzone1.alzaVolume();
        canzone1.Play();
        System.out.println("");
        video1.Play();
        System.out.println("");
        immagine1.Show();



        }

        


        }
    }

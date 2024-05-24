import Elements.*;

public class Main {
    public static void main(String[] args) {

        Audio canzone1 = new Audio ("Sultans of Swing", 5, 3);
        Video video1 = new Video("Best of Maradona", 7, 6, 4);

        canzone1.alzaVolume();
        canzone1.alzaVolume();
        canzone1.Play();

        video1.Play();

        }
    }

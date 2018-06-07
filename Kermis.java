import java.util.Scanner;

class Kermis {

    final void run() {

        Attractie botsautos = new Botsautos("Botsautos");
        Attractie spin = new Spin("Spin");
        Attractie spiegelpaleis = new Spiegelpaleis("Spiegelpaleis");
        Attractie spookhuis = new Spookhuis("Spookhuis");
        Attractie hawaii = new Hawaii("Hawaii");
        Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen");

        Scanner input = new Scanner(System.in);
        boolean keuzeAttractie = false;

        System.out.println("Kies attractie");
        while (!keuzeAttractie) {
            int keuze = input.nextInt();
            if (keuze == 1) {
                botsautos.draaien();
                keuzeAttractie = true;
            }
            else if (keuze == 2) {
                spin.draaien();
                keuzeAttractie = true;
            }
            else if (keuze == 3) {
                spiegelpaleis.draaien();
                keuzeAttractie = true;
            }
            else if (keuze == 4) {
                spookhuis.draaien();
                keuzeAttractie = true;
            }
            else if (keuze == 5) {
                hawaii.draaien();
                keuzeAttractie = true;
            }
            else if (keuze == 5) {
                ladderklimmen.draaien();
                keuzeAttractie = true;
            } else {
                System.out.println("ongeldige waarde");
                continue;
            }
        }
    }
}

import java.util.Scanner;

class Kermis {

    Attractie botsautos = new Botsautos("Botsautos", 2.50, 50);
    Attractie spin = new Spin("Spin", 2.25, 60);
    Attractie spiegelpaleis = new Spiegelpaleis("Spiegelpaleis", 2.75, 40);
    Attractie spookhuis = new Spookhuis("Spookhuis", 3.20, 60);
    Attractie hawaii = new Hawaii("Hawaii", 2.90, 40);
    Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 10);

    final void run() {

        runKermis();

    }

    private void runKermis() {

        Scanner input = new Scanner(System.in);
        boolean run = false;

        System.out.println("Kies attractie");
        while (!run) {
            int keuze = input.nextInt();
            if (keuze == 1) {
                botsautos.draaien();
                continue;
            } else if (keuze == 2) {
                spin.draaien();
                continue;
            } else if (keuze == 3) {
                spiegelpaleis.draaien();
                continue;
            } else if (keuze == 4) {
                spookhuis.draaien();
                continue;
            } else if (keuze == 5) {
                hawaii.draaien();
                continue;
            } else if (keuze == 5) {
                ladderklimmen.draaien();
                continue;
            } else {
                System.out.println("ongeldige waarde");
                continue;
            }
        }
    }
}

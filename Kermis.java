import java.util.Objects;
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


        System.out.println("De Kermis!");

        attractieKiezen();

        System.out.println("Programma stopt");

    }

    private void attractieKiezen(){

        attractieMenuTekst();

        Scanner input = new Scanner(System.in);
        boolean doorgaan = false;

        while (!doorgaan) {
            if (input.hasNextInt()) {
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
                } else if (keuze == 6) {
                    ladderklimmen.draaien();
                    continue;
                } else {
                    System.out.println("ongeldige waarde");
                    continue;
                }
            } else {
                String keuze = input.nextLine();
                if (Objects.equals(keuze, "s")) {
                    doorgaan = true;
                }
            }
        }
    }

    private void attractieMenuTekst(){

        System.out.println("Kies attractie");
        System.out.println("1: " + botsautos.getNaam() + " - " + botsautos.getPrijs());
        System.out.println("2: " + spin.getNaam() + " - " + spin.getPrijs());
        System.out.println("3: " + spiegelpaleis.getNaam() + " - " + spiegelpaleis.getPrijs());
        System.out.println("4: " + spookhuis.getNaam() + " - " + spookhuis.getPrijs());
        System.out.println("5: " + hawaii.getNaam() + " - " + hawaii.getPrijs());
        System.out.println("6: " + ladderklimmen.getNaam() + " - " + ladderklimmen.getPrijs());
        System.out.println("'o': Laat omzet zien");
        System.out.println("'k': Aantal kaartjes verkocht");
        System.out.println("'s': Stoppen");

    }
}

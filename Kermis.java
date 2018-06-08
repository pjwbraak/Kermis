import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Kermis {

    ArrayList<Attractie> attractieLijst = new ArrayList<Attractie>();

    Attractie botsautos     = new Botsautos("Botsautos", 2.50, 50);
    Attractie spin          = new Spin("Spin", 2.25, 60);
    Attractie spiegelpaleis = new Spiegelpaleis("Spiegelpaleis", 2.75, 40);
    Attractie spookhuis     = new Spookhuis("Spookhuis", 3.20, 60);
    Attractie hawaii        = new Hawaii("Hawaii", 2.90, 40);
    Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 10);

    Kassa kassa = new Kassa();

    final void run() {

        runKermis();

    }

    private void runKermis() {

        addToAttractieLijst(    botsautos,
                                spin,
                                spiegelpaleis,
                                spookhuis,
                                hawaii,
                                ladderklimmen
                            );

        System.out.println("De Kermis!");

        attractieKiezen();

        System.out.println("Programma stopt");

    }

    private void addToAttractieLijst(Attractie... attractie){
        for (Attractie x : attractie) {
            attractieLijst.add(x);
        }
    }

    private void attractieKiezen(){

        printAttractieMenuTekst();

        Scanner input = new Scanner(System.in);
        boolean doorgaan = false;

        while (!doorgaan) {
            if (input.hasNextInt()) {
                int keuze = input.nextInt();
                    for(int x = 0; x < attractieLijst.size(); x++){
                        if (keuze == (x + 1)) {
                            verwerkAttractie(attractieLijst.get(x));
                            continue;
                        }
                    }
                    if (keuze > attractieLijst.size()){
                    System.out.println("ongeldige waarde");
                    continue;
                    }
            } else {
                String keuze = input.nextLine();
                if (Objects.equals(keuze, "o")) {
                    System.out.println("De totale omzet is:");
                    System.out.println(kassa.getOmzet());
                }
                else if (Objects.equals(keuze, "k")) {
                    System.out.println("kaartjes laten zien");
                }
                else if (Objects.equals(keuze, "s")) {
                    doorgaan = true;
                }
            }
        }
    }

    private void verwerkAttractie(Attractie attractie){
        double omzetTotaal = kassa.getOmzet() + attractie.getPrijs();
        kassa.setOmzet(omzetTotaal);
        attractie.draaien();
    }

    private void printAttractieMenuTekst(){

        System.out.println("Kies attractie:");
        for(int x = 0; x < attractieLijst.size(); x++){
            System.out.println((x + 1) + ": " + attractieLijst.get(x).getNaam() + " - " + attractieLijst.get(x).getPrijs());
        }
        System.out.println("'o': Laat omzet zien");
        System.out.println("'k': Aantal kaartjes verkocht");
        System.out.println("'s': Stoppen");
    }
}

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

        keuzeMenuKermis();

        System.out.println("Programma stopt");

    }

    private void addToAttractieLijst(Attractie... attractie){

        for (Attractie x : attractie) {
            attractieLijst.add(x);
        }
    }

    private void keuzeMenuKermis(){

        printAttractieMenuTekst();

        Scanner input = new Scanner(System.in);
        boolean doorgaan = true;

        while (doorgaan) {
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
                String keuze = input.nextLine().toLowerCase();
                if (Objects.equals(keuze, "o")) {
                    printOmzet();
                }
                else if (Objects.equals(keuze, "k")) {
                    System.out.println("kaartjes laten zien");
                }
                else if (Objects.equals(keuze, "s")) {
                    doorgaan = false;
                }
            }
        }
    }

    private void verwerkAttractie(Attractie attractie){

        double omzetTotaal    = kassa.getOmzet() + attractie.getPrijs();
        double attractieOmzet = attractie.getOmzet() + attractie.getPrijs();
        int kaartjesTotaal    = attractie.getKaartjesVerkocht() + 1;

        kassa.setOmzet(omzetTotaal);
        attractie.setOmzet(attractieOmzet);
        attractie.setKaartjesVerkocht(kaartjesTotaal);
        attractie.draaien();
    }

    private void printAttractieMenuTekst(){

        System.out.println("Kies attractie:");
        for(int x = 0; x < attractieLijst.size(); x++){
            System.out.println((x + 1) + ": " + attractieLijst.get(x).getNaam() + " - " + attractieLijst.get(x).getPrijs());
        }
        System.out.println("'O': Laat omzet zien");
        System.out.println("'K': Aantal kaartjes verkocht");
        System.out.println("'S': Stoppen");
    }

    private void printOmzet(){

        System.out.println("De totale omzet is:");
        System.out.println(kassa.getOmzet());
        System.out.println("De omzet per attractie is:");
        for(int x = 0; x < attractieLijst.size(); x++){
            System.out.println((x + 1) + ": " + attractieLijst.get(x).getNaam() + " - " + attractieLijst.get(x).getOmzet());
        }

    }
}
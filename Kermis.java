import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Kermis {

    ArrayList<Attractie> attractieLijst = new ArrayList<Attractie>();

    Kassa kassa = new Kassa();

    Kermis(Attractie... attracties){
            addAttracties(attracties);
    }

    final void run() throws Exception {
        if (attractieLijst.size() < 1) {
            throw new Exception("Kermis kan niet runnen zonder attracties");
        } else {
            runKermis();
        }
    }

    private void runKermis() {

        System.out.println("De Kermis!");

        toonKeuzeMenuKermis();

        System.out.println("Programma stopt...");

    }

    public void addAttracties(Attractie... attracties){

        for (Attractie x : attracties) {
            attractieLijst.add(x);
        }
    }

    private void toonKeuzeMenuKermis(){

        printAttractieMenuTekst();

        Scanner input = new Scanner(System.in);
        boolean doorgaan = true;

        while (doorgaan) {
            if (input.hasNextInt()) {
                int keuze = input.nextInt();
                    for(int x = 0; x < attractieLijst.size(); x++){
                        if (keuze == (x + 1)) {
                            if(!(attractieLijst.get(x) instanceof RisicoRijkeAttracties)) {
                                verwerkAttractie(attractieLijst.get(x));
                                continue;
                            } else if (((RisicoRijkeAttracties) attractieLijst.get(x)).opstellingsKeuring() == true){
                                System.out.println("onderhoud nodig");
                                verwerkAttractie(attractieLijst.get(x));
                                continue;
                            } else {
                                verwerkAttractie(attractieLijst.get(x));
                                continue;
                            }
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
                    printKaartjes();
                }
                else if (Objects.equals(keuze, "s")) {
                    doorgaan = false;
                }
            }
        }
    }

    private void verwerkAttractie(Attractie attractie){

        double omzetTotaal          = kassa.getOmzet() + attractie.getPrijs();
        double attractieOmzet       = attractie.getOmzet() + attractie.getPrijs();
        int kaartjesTotaal          = kassa.getKaartjesVerkocht() + 1;
        int attractieKaartjesTotaal = attractie.getKaartjesVerkocht() + 1;

        kassa.setOmzet(omzetTotaal);
        attractie.setOmzet(attractieOmzet);
        kassa.setKaartjesVerkocht(kaartjesTotaal);
        attractie.setKaartjesVerkocht(attractieKaartjesTotaal);
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

    private void printKaartjes(){

        System.out.println("Het totaal verkochte kaartjes is:");
        System.out.println(kassa.getKaartjesVerkocht());
        System.out.println("Het aantal kaartjes verkocht per attractie is:");
        for(int x = 0; x < attractieLijst.size(); x++){
            System.out.println((x + 1) + ": " + attractieLijst.get(x).getNaam() + " - " + attractieLijst.get(x).getKaartjesVerkocht());
        }
    }
}
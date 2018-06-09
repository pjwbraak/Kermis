import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Kermis {

    ArrayList<Attractie> attractieLijst = new ArrayList<Attractie>();

    Kassa kassa = new Kassa();
    BelastingInspecteur belastinginspecteur = new BelastingInspecteur();

    Kermis(Attractie... attracties){
            addAttracties(attracties);
    }

    final void run() throws Exception {
        if (attractieLijst.size() < 1) {
            throw new Exception("Kermis kan niet draaien zonder attracties!");
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
                            if(!controleerOpOnderhoud(attractieLijst.get(x))) {
                                verwerkAttractie(attractieLijst.get(x));
                                continue;
                            } else {
                                toonOnderhoudMenu(attractieLijst.get(x));
                                verwerkAttractie(attractieLijst.get(x));
                                continue;
                            }
                        }
                    }
                    if (keuze > attractieLijst.size() || keuze < 1){
                    System.out.println("Ongeldige waarde!");
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
                else if (Objects.equals(keuze, "b")) {
                    verwerkBezoekBelastingInspecteur();
                }
                else if (Objects.equals(keuze, "s")) {
                    doorgaan = false;
                }
                else {
                    System.out.println("Ongeldige waarde!");
                    continue;
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

    private boolean controleerOpOnderhoud(Attractie attractie){
        if(!(attractie instanceof RisicoRijkeAttracties)){
            return false;
        } else if (((RisicoRijkeAttracties) attractie).opstellingsKeuring()) {
            return true;
        } else {
            return false;
        }
    }

    private void verwerkBezoekBelastingInspecteur(){

        kassa.setBezoekenBelastinginspecteur(kassa.getBezoekenBelastinginspecteur() + 1);
        //30% van omzet halen per attractie

        System.out.println(belastinginspecteur.vindGokAttracties(attractieLijst));
    }

    private void toonOnderhoudMenu(Attractie attractie){

        boolean gecontroleerd   = false;
        Scanner input           = new Scanner(System.in);

        System.out.println("De attractie " + attractie.getNaam() + " moet eerst onderhoud krijgen!");
        System.out.println("Roep een monteur aan met 'M'...");
        while(!gecontroleerd){
            if (!input.hasNextInt()) {
                String keuze = input.nextLine().toLowerCase();
                if (Objects.equals(keuze, "m")) {
                    System.out.println("Monteur heeft onderhoud uitgevoerd.");
                    gecontroleerd = true;
                } else {
                    System.out.println("Ongeldige waarde!");
                }
            } else {
                int keuze = input.nextInt();
                if (keuze >= 0 || keuze <= 0) {
                    System.out.println("Ongeldige waarde!");
                    continue;
                }
            }
        }
    }

    private void printAttractieMenuTekst(){

        System.out.println("Kies attractie:");
        for(int x = 0; x < attractieLijst.size(); x++){
            System.out.println((x + 1) + ": " + attractieLijst.get(x).getNaam() + " - " + attractieLijst.get(x).getPrijs());
        }
        System.out.println("'O': Laat omzet zien");
        System.out.println("'K': Aantal kaartjes verkocht");
        System.out.println("'B': Bezoek belastinginspecteur");
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
package Main;

import Attractie.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Kermis implements FinancieleNotatie {

    private ArrayList<Attractie> attractieLijst     = new ArrayList<>();
    private PrintMessage printmessage               = new PrintMessage();
    private Kassa kassa                             = new Kassa();
    private BelastingInspecteur belastinginspecteur = new BelastingInspecteur();

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

        printmessage.printAttractieMenuTekst(attractieLijst);

        Scanner input = new Scanner(System.in);
        boolean doorgaan = true;

        while (doorgaan) {
            if (input.hasNextInt()) {
                int keuze = input.nextInt();
                    for(int x = 0; x < attractieLijst.size(); x++){
                        if (keuze == (x + 1)) {
                            if(attractieLijst.get(x) instanceof RisicoRijkeAttracties) {
                                controleerOpOnderhoud((RisicoRijkeAttracties)attractieLijst.get(x));
                                verwerkAttractieRit(attractieLijst.get(x));
                                continue;
                            } else {
                                verwerkAttractieRit(attractieLijst.get(x));
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
                    printmessage.printOmzet(attractieLijst, kassa);
                }
                else if (Objects.equals(keuze, "k")) {
                    printmessage.printKaartjes(attractieLijst, kassa);
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

    private void verwerkAttractieRit(Attractie attractie){

        double attractieOmzet       = attractie.getOmzet() + attractie.getPrijs();
        int attractieKaartjesTotaal = attractie.getKaartjesVerkocht() + 1;

        attractie.setOmzet(round(attractieOmzet, 2));
        attractie.setKaartjesVerkocht(attractieKaartjesTotaal);
        attractie.draaien();
    }

    private boolean controleerOpOnderhoud(RisicoRijkeAttracties attractie){
            try{
                attractie.checkOpstellingsKeuring();
            } catch (Exception e) {
                System.out.println(e);
                toonOnderhoudMenu((Attractie)attractie);
            }
            return true;
    }

    private void toonOnderhoudMenu(Attractie attractie){

        boolean gecontroleerd   = false;
        Scanner input           = new Scanner(System.in);

        System.out.println("Roep een monteur aan met 'M'...");
        while(!gecontroleerd){
            if (!input.hasNextInt()) {
                String keuze = input.nextLine().toLowerCase();
                if (Objects.equals(keuze, "m")) {
                    System.out.println("Monteur heeft onderhoud uitgevoerd op " + attractie.getNaam());
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

    private void verwerkBezoekBelastingInspecteur(){

        kassa.setBezoekenBelastinginspecteur(kassa.getBezoekenBelastinginspecteur() + 1);
        System.out.println(kassa.getBezoekenBelastinginspecteur() + "e bezoek belastinginspecteur.");

        belastinginspecteur.haalBelastingOp(belastinginspecteur.vindGokAttracties(attractieLijst));
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
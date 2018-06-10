package Main;

import Attractie.Attractie;

import java.util.ArrayList;

class PrintMessage {

    void printAttractieMenuTekst(ArrayList<Attractie> attractielijst){

        System.out.println("Kies attractie:");
        for(int x = 0; x < attractielijst.size(); x++){
            System.out.println((x + 1) + ": " + attractielijst.get(x).getNaam() + " - " + attractielijst.get(x).getPrijs());
        }
        System.out.println("'O': Laat omzet zien");
        System.out.println("'K': Aantal kaartjes verkocht");
        System.out.println("'B': Bezoek belastinginspecteur");
        System.out.println("'S': Stoppen");
    }

    void printOmzet(ArrayList<Attractie> attractielijst, Kassa kassa){

        System.out.println("De totale omzet is:");
        System.out.println(kassa.getOmzet(attractielijst));
        System.out.println("De omzet per attractie is:");
        for(int x = 0; x < attractielijst.size(); x++){
            System.out.println((x + 1) + ": " + attractielijst.get(x).getNaam() + " - " + attractielijst.get(x).getOmzet());
        }
    }

    void printKaartjes(ArrayList<Attractie> attractielijst, Kassa kassa){

        System.out.println("Het totaal verkochte kaartjes is:");
        System.out.println(kassa.getKaartjesVerkocht(attractielijst));
        System.out.println("Het aantal kaartjes verkocht per attractie is:");
        for(int x = 0; x < attractielijst.size(); x++){
            System.out.println((x + 1) + ": " + attractielijst.get(x).getNaam() + " - " + attractielijst.get(x).getKaartjesVerkocht());
        }
    }

}

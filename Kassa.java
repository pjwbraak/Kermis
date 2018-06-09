import java.util.ArrayList;

class Kassa {

    private int bezoekenBelastinginspecteur = 0;

    public double getOmzet(ArrayList<Attractie> attracties) {
        double omzet = 0;
        for (Attractie x : attracties) {
            omzet = omzet + x.getOmzet();
        }
        return omzet;
    }

    public int getKaartjesVerkocht(ArrayList<Attractie> attracties) {
        int kaartjesVerkocht = 0;
        for (Attractie x : attracties) {
            kaartjesVerkocht = kaartjesVerkocht + x.getKaartjesVerkocht();
        }
        return kaartjesVerkocht;
    }

    public int getBezoekenBelastinginspecteur() {
        return bezoekenBelastinginspecteur;
    }

    public void setBezoekenBelastinginspecteur(int bezoekenBelastinginspecteur) {
        this.bezoekenBelastinginspecteur = bezoekenBelastinginspecteur;
    }
}

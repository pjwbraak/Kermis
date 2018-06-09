import java.util.ArrayList;

class Kassa {

    private double omzet;
    private int kaartjesVerkocht;
    private int bezoekenBelastinginspecteur = 0;

    public double getOmzet(ArrayList<Attractie> attracties) {
        for (Attractie x : attracties) {
            omzet = omzet + x.getOmzet();
        }
        return omzet;
    }

    public int getKaartjesVerkocht(ArrayList<Attractie> attracties) {
        for (Attractie x : attracties) {
            kaartjesVerkocht = kaartjesVerkocht + x.getKaartjesVerkocht();
        }
        return kaartjesVerkocht;
    }

    public void setOmzet(double omzet) {
        this.omzet = omzet;
    }

    public void setKaartjesVerkocht(int kaartjesVerkocht) {
        this.kaartjesVerkocht = kaartjesVerkocht;
    }

    public int getBezoekenBelastinginspecteur() {
        return bezoekenBelastinginspecteur;
    }

    public void setBezoekenBelastinginspecteur(int bezoekenBelastinginspecteur) {
        this.bezoekenBelastinginspecteur = bezoekenBelastinginspecteur;
    }
}

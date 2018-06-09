class Kassa {

    private double omzet;
    private int kaartjesVerkocht;
    private int bezoekenBelastinginspecteur = 0;

    public double getOmzet(Attractie... attractie) {
        for (Attractie x : attractie) {
            omzet = omzet + x.getOmzet();
        }
        return omzet;
    }

    public int getKaartjesVerkocht() {
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

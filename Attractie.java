abstract class Attractie {

    String naam;
    double prijs;
    int oppervlakte;
    double omzet;
    int kaartjesVerkocht;

    void draaien(){
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public int getOppervlakte() {
        return oppervlakte;
    }

    public double getOmzet() {
        return omzet;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void setOppervlakte(int oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    public void setOmzet(double omzet) {
        this.omzet = omzet;
    }

    public void setKaartjesVerkocht(int kaartjesVerkocht) {
        this.kaartjesVerkocht = kaartjesVerkocht;
    }
}

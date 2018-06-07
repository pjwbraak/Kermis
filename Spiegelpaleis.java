class Spiegelpaleis extends Attractie {

    private String naam;
    private double prijs;
    private int oppervlakte;
    private double omzet;
    private int kaartjesVerkocht;

    Spiegelpaleis(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
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

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

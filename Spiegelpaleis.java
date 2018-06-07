class Spiegelpaleis extends Attractie {

    private String naam;
    private double prijs;
    private int oppervlakte;
    private double omzet;

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

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

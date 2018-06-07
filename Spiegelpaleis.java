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

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

class Ladderklimmen extends Attractie {

    private String naam;
    private double prijs;
    private int oppervlakte;
    private double omzet;

    Ladderklimmen(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}
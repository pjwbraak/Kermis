class Spookhuis extends Attractie {

    String naam;
    double prijs;
    int oppervlakte;
    double omzet;

    Spookhuis(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

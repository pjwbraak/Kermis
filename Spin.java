class Spin extends Attractie implements RisicoRijkeAttracties{

    private int draaiLimiet = 5;

    Spin(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
    }

    public int getDraaiLimiet() {
        return draaiLimiet;
    }

    public boolean opstellingsKeuring(){
        return true;
    }
}

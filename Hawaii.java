class Hawaii extends Attractie implements RisicoRijkeAttracties{

    private int draaiLimiet;

    Hawaii(String naam, double prijs, int oppervlakte, int draaiLimiet){
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
        this.draaiLimiet = draaiLimiet;
    }

    public int getDraaiLimiet() {
        return draaiLimiet;
    }

    public boolean opstellingsKeuring(){
        return true;
    }
}
class Hawaii extends Attractie implements RisicoRijkeAttracties{

    private int draaiLimiet = 10;

    Hawaii(String naam, double prijs, int oppervlakte){
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
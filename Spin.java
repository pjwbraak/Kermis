class Spin extends GokAttractie implements RisicoRijkeAttracties{

    private int draaiLimiet;

    Spin(String naam, double prijs, int oppervlakte, int draaiLimiet){
        this.naam = naam;
        this.prijs = prijs;
        this.oppervlakte = oppervlakte;
        this.draaiLimiet = draaiLimiet;
    }

    public int getDraaiLimiet() {
        return draaiLimiet;
    }

    public void setDraaiLimiet(int draaiLimiet) {
        this.draaiLimiet = draaiLimiet;
    }

    public boolean opstellingsKeuring(){
        if(kaartjesVerkocht % draaiLimiet == 0 && kaartjesVerkocht > 0) {
            return true;
        } else {
            return false;
        }
    }
}

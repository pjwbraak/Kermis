package Attractie;

public class Spin extends GokAttractie implements RisicoRijkeAttracties {

    private int draaiLimiet;

    public Spin(String naam, double prijs, int oppervlakte, int draaiLimiet){
        this.naam = naam;
        this.prijs = round(prijs,2);
        this.oppervlakte = oppervlakte;
        this.draaiLimiet = draaiLimiet;
    }

    public int getDraaiLimiet() {
        return draaiLimiet;
    }

    public void setDraaiLimiet(int draaiLimiet) {
        this.draaiLimiet = draaiLimiet;
    }

    public boolean checkOpstellingsKeuring() throws Exception{
        if(kaartjesVerkocht % draaiLimiet == 0 && kaartjesVerkocht > 0) {
            throw new Exception("Attractie " + naam + " heeft onderhoud nodig!");
        } else {
            return false;
        }
    }
}

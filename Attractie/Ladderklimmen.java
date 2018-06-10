package Attractie;

public class Ladderklimmen extends GokAttractie {

    public Ladderklimmen(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = round(prijs, 2);
        this.oppervlakte = oppervlakte;
    }
}
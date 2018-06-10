package Attractie;

public class Spiegelpaleis extends Attractie {

    public Spiegelpaleis(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = round(prijs, 2);
        this.oppervlakte = oppervlakte;
    }
}

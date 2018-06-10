package Attractie;

public class Spookhuis extends Attractie {

    public Spookhuis(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = round(prijs, 2);
        this.oppervlakte = oppervlakte;
    }
}

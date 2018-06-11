package attractie;

public class Botsautos extends Attractie {

    public Botsautos(String naam, double prijs, int oppervlakte){
        this.naam = naam;
        this.prijs = round(prijs, 2);
        this.oppervlakte = oppervlakte;
    }
}

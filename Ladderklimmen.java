public class Ladderklimmen extends Attractie {

    String naam;
    float prijs;
    int oppervlakte;

    Ladderklimmen(String naam){
        this.naam = naam;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}
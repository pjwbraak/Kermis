public class Ladderklimmen extends Attractie {

    String naam;

    Ladderklimmen(String naam){
        this.naam = naam;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}
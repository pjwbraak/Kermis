class Spookhuis extends Attractie {

    String naam;
    float prijs;
    int oppervlakte;

    Spookhuis(String naam){
        this.naam = naam;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

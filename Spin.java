class Spin extends Attractie {

    String naam;
    float prijs;
    int oppervlakte;

    Spin(String naam){
        this.naam = naam;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

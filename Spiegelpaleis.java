class Spiegelpaleis extends Attractie {

    String naam;

    Spiegelpaleis(String naam){
        this.naam = naam;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

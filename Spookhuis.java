class Spookhuis extends Attractie {

    String naam;

    Spookhuis(String naam){
        this.naam = naam;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}

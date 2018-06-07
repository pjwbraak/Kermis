public class Hawaii extends Attractie {

    String naam;
    float prijs;
    int oppervlakte;

    Hawaii(String naam){
        this.naam = naam;
    }

    @Override
    void draaien(){
        System.out.println("De attractie '" + naam + "' draait");
    }
}
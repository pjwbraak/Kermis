package Main;

import Attractie.*;

public class Main {
    public static void main(String[] args) {

        //welke attracties bestaan er allemaal:
        Attractie botsautos     = new Botsautos("Botsautos", 2.50, 50);
        Attractie spin          = new Spin("Spin", 2.25, 60,5);
        Attractie spiegelpaleis = new Spiegelpaleis("Spiegelpaleis", 2.75, 40);
        Attractie spookhuis     = new Spookhuis("Spookhuis", 3.20, 60);
        Attractie hawaii        = new Hawaii("Hawaii", 2.90, 40, 10);
        Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 10);

        //welke van deze attracties ga je gebruiken in je eigen kermis:
        Kermis kermis = new Kermis( botsautos,
                                    spin,
                                    spiegelpaleis,
                                    spookhuis,
                                    hawaii,
                                    ladderklimmen);
        try{
            kermis.run();
        } catch (Exception e){
            System.out.println("Kermis heeft minimaal 1 attractie nodig.");
            System.out.println(e);
        }
    }
}

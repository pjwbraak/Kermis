public class Main {
    public static void main(String[] args){

        Attractie botsautos     = new Botsautos("Botsautos", 2.50, 50);
        Attractie spin          = new Spin("Spin", 2.25, 60);
        Attractie spiegelpaleis = new Spiegelpaleis("Spiegelpaleis", 2.75, 40);
        Attractie spookhuis     = new Spookhuis("Spookhuis", 3.20, 60);
        Attractie hawaii        = new Hawaii("Hawaii", 2.90, 40);
        Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen", 5.00, 10);

        Kermis kermis = new Kermis( botsautos,
                                    spin,
                                    spiegelpaleis,
                                    spookhuis,
                                    hawaii,
                                    ladderklimmen);

        kermis.run();

    }
}

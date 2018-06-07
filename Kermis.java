class Kermis {

    final void starten(){

        Attractie botsautos = new Botsautos("Botsautos");
        Attractie spin = new Spin("Spin");
        Attractie spiegelpaleis = new Spiegelpaleis("Spiegelpaleis");
        Attractie spookhuis = new Spookhuis("Spookhuis");
        Attractie hawaii = new Hawaii("Hawaii");
        Attractie ladderklimmen = new Ladderklimmen("Ladderklimmen");

        botsautos.draaien();
        spin.draaien();
        spiegelpaleis.draaien();
        spookhuis.draaien();
        hawaii.draaien();
        ladderklimmen.draaien();

    }

}

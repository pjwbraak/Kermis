import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

class Kassa implements FinancieleNotatie{

    private int bezoekenBelastinginspecteur = 0;

    public double getOmzet(ArrayList<Attractie> attracties) {

        double omzet = 0;

        for (Attractie x : attracties) {
            omzet = omzet + x.getOmzet();
        }
        return round(omzet, 2);
    }

    public int getKaartjesVerkocht(ArrayList<Attractie> attracties) {

        int kaartjesVerkocht = 0;

        for (Attractie x : attracties) {
            kaartjesVerkocht = kaartjesVerkocht + x.getKaartjesVerkocht();
        }
        return kaartjesVerkocht;
    }

    public int getBezoekenBelastinginspecteur() {
        return bezoekenBelastinginspecteur;
    }

    public void setBezoekenBelastinginspecteur(int bezoekenBelastinginspecteur) {
        this.bezoekenBelastinginspecteur = bezoekenBelastinginspecteur;
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

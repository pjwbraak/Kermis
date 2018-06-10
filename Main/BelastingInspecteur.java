package Main;

import Attractie.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

class BelastingInspecteur implements FinancieleNotatie {

    private ArrayList<GokAttractie> gokattracties = new ArrayList();

    ArrayList<GokAttractie> vindGokAttracties(ArrayList<Attractie> attractie) {

        for (int x = 0; x < attractie.size(); x++)
            if (attractie.get(x) instanceof GokAttractie && !gokattracties.contains(attractie.get(x))) {
                gokattracties.add((GokAttractie) attractie.get(x));
            }
        return gokattracties;
    }

    double haalBelastingOp(ArrayList<GokAttractie> attractie) {

        double belastingOpgehaald = 0;

        for (int x = 0; x < attractie.size(); x++) {
            GokAttractie gokattractie = attractie.get(x);
            belastingOpgehaald += gokattractie.kansSpelBelastingAfstaan();
        }
        System.out.println("Belastinginspecteur heeft " + belastingOpgehaald + " (30% van gokattracties) belasting opgehaald");
        return round(belastingOpgehaald, 2);
    }

    public ArrayList<GokAttractie> getGokattracties() {

        return gokattracties;
    }

    public void setGokattracties(ArrayList<GokAttractie> gokattracties) {

        this.gokattracties = gokattracties;
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
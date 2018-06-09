import java.util.ArrayList;

class BelastingInspecteur {

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
        return belastingOpgehaald;
    }

    public ArrayList<GokAttractie> getGokattracties() {
        return gokattracties;
    }

    public void setGokattracties(ArrayList<GokAttractie> gokattracties) {
        this.gokattracties = gokattracties;
    }
}
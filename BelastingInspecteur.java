import java.util.ArrayList;

class BelastingInspecteur {

    private ArrayList<GokAttractie> gokattracties = new ArrayList();

    ArrayList<GokAttractie> vindGokAttracties(ArrayList<Attractie> attractie){
        for (int x = 0; x < attractie.size(); x++)
            if(attractie.get(x) instanceof GokAttractie && !gokattracties.contains(attractie.get(x))){
                gokattracties.add((GokAttractie)attractie.get(x));
            }
        return gokattracties;
        }

    private void haalBelastingOp(Kassa kassa){
        
    }

    public ArrayList<GokAttractie> getGokattracties() {
        return gokattracties;
    }

    public void setGokattracties(ArrayList<GokAttractie> gokattracties) {
        this.gokattracties = gokattracties;
    }

}

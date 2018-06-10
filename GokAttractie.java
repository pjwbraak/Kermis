abstract class GokAttractie extends Attractie{

    static double omzetBelasting = 0.7;

    double kansSpelBelastingAfstaan(){

        double omzetMinBelasting = (this.getOmzet() * omzetBelasting);
        double belasting         = (this.getOmzet() - omzetMinBelasting);

        this.setOmzet(round(omzetMinBelasting, 2));
        return round(belasting, 2);
    }
}

package Attractie;

import Main.FinancieleNotatie;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Attractie implements FinancieleNotatie {

    String naam;
    double prijs;
    int oppervlakte;
    double omzet;
    int kaartjesVerkocht;

    public void draaien(){
            System.out.println("De attractie '" + naam + "' draait");
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return round(prijs, 2);
    }

    public int getOppervlakte() {
        return oppervlakte;
    }

    public double getOmzet() {
        return round(omzet, 2);
    }

    public int getKaartjesVerkocht() {
        return kaartjesVerkocht;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setPrijs(double prijs) {
        this.prijs = round(prijs, 2);
    }

    public void setOppervlakte(int oppervlakte) {
        this.oppervlakte = oppervlakte;
    }

    public void setOmzet(double omzet) {
        this.omzet = round(omzet, 2);
    }

    public void setKaartjesVerkocht(int kaartjesVerkocht) {
        this.kaartjesVerkocht = kaartjesVerkocht;
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

package HomeWorks.HomeWork4.Car;

public class Wheel {

    private double diameter;
    private boolean klaxonSignal;

    public double getDiameter() {
        return diameter;
    }

    public boolean getKlaxonSignal() {
        return klaxonSignal;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void setKlaxonSignal(boolean klaxon) {
        this.klaxonSignal = klaxon;
    }

    public String toString() {
        System.out.println("Beep - Beep - Beep!!!");
        return null;
    }

    public void changeKlaxonSignal() {
        this.klaxonSignal = (klaxonSignal == true) ? false : true;
    }

}

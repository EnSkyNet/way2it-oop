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
        System.out.println("The diameter of wheel " + getDiameter() + ". The klaxon is touch: " + getKlaxonSignal() + ".");
        return null;
    }

    public void changeKlaxonSignal() {
        this.klaxonSignal = (klaxonSignal == true) ? false : true;
        if (klaxonSignal == true){
            System.out.println("The klaxon is: Beep - Beep - Beep!!!");

        }else {
            System.out.println("Touch the klaxon");
        }
    }

    public Wheel(double diameter, boolean klaxonSignal){
        setDiameter(diameter);
        setKlaxonSignal(klaxonSignal);
    }
}

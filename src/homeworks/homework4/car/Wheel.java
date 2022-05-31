package homeworks.homework4.car;

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

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", klaxonSignal=" + klaxonSignal +
                '}';
    }

    public void changeKlaxonSignal() {
        this.klaxonSignal = (klaxonSignal == true) ? false : true;
        if (klaxonSignal == true) {
            System.out.println("The klaxon is: Beep - Beep - Beep!!!");

        } else {
            System.out.println("Touch the klaxon");
        }
    }

    public Wheel(double diameter, boolean klaxonSignal) {
        this.diameter = diameter;
        this.klaxonSignal = klaxonSignal;
    }
}

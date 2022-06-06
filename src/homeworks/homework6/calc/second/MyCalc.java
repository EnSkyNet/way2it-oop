package homeworks.homework6.calc.second;

import homeworks.homework6.calc.first.Nurable;

public class MyCalc implements Nurable {
     private int first;
    private int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public MyCalc(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void divide() {
        System.out.println(this.first + "/" + this.second + "=" + (this.first / this.second));
    }

    @Override
    public void minus() {
        System.out.println(this.first + "-" + this.second + "=" + (this.first - this.second));
    }

    @Override
    public void multiply() {
        System.out.println(this.first + "*" + this.second + "=" + (this.first * this.second));
    }

    @Override
    public void plus() {
        System.out.println(this.first + "+" + this.second + "=" + (this.first + this.second));
    }
}
package HomeWorks.HomeWork6.Calc.Second;

import HomeWorks.HomeWork6.Calc.First.Nurable;

public class MyCalc implements Nurable {
    int first;
    int second;
    int rezult;

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

    public int getRezult() {
        return rezult;
    }

    public void setRezult(int rezult) {
        this.rezult = rezult;
    }

    public MyCalc(int first, int second){
        setFirst(first);
        setSecond(second);
    }

    @Override
    public void divide() {
        setRezult(getFirst() / getSecond());
        System.out.println(getFirst()+"/"+getSecond()+"="+getRezult());
    }

    @Override
    public void minus() {
        setRezult(getFirst() - getSecond());
        System.out.println(getFirst()+"-"+getSecond()+"="+getRezult());
    }

    @Override
    public void multiply() {
        setRezult(getFirst() * getSecond());
        System.out.println(getFirst()+"*"+getSecond()+"="+getRezult());
    }

    @Override
    public void plus() {
        setRezult(getFirst() + getSecond());
        System.out.println(getFirst()+"+"+getSecond()+"="+getRezult());
    }
}
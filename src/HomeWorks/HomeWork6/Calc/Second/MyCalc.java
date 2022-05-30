package HomeWorks.HomeWork6.Calc.Second;

import HomeWorks.HomeWork6.Calc.First.Nurable;

public class MyCalc implements Nurable {
    int first;
    int second;
    int result;

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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public MyCalc(int first, int second){
        setFirst(first);
        setSecond(second);
    }

    @Override
    public void divide() {
        setResult(getFirst() / getSecond());
        System.out.println(getFirst()+"/"+getSecond()+"="+getResult());
    }

    @Override
    public void minus() {
        setResult(getFirst() - getSecond());
        System.out.println(getFirst()+"-"+getSecond()+"="+getResult());
    }

    @Override
    public void multiply() {
        setResult(getFirst() * getSecond());
        System.out.println(getFirst()+"*"+getSecond()+"="+getResult());
    }

    @Override
    public void plus() {
        setResult(getFirst() + getSecond());
        System.out.println(getFirst()+"+"+getSecond()+"="+getResult());
    }
}
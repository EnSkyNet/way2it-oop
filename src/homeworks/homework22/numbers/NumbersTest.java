package homeworks.homework22.numbers;

import java.util.Arrays;

public class NumbersTest {
    public static void main(String[] args) {
        ICalc iCalc = (one, two, three) -> (one + two + three)/3;


        int one = 10;
        int two = 20;
        int three = 40;

        int middle = iCalc.action(one, two, three);
        System.out.println(middle);

    }
    interface ICalc{
        int action(int one, int two, int three);
    }
}

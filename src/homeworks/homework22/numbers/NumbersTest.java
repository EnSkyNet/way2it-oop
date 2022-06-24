package homeworks.homework22.numbers;

public class NumbersTest {
    public static void main(String[] args) {
        SunAverageMaxFunction averageFunction = (one, two, three) -> (one + two + three) / 3;
        SunAverageMaxFunction sumFunction = (one, two, three) -> one + two + three;
        SunAverageMaxFunction findMaxNumberFunction = (one, two, three) -> {
            int max = one;
            if (max < two) max = two;
            if (max < three) max = three;
            return max;
        };

        int one = 10;
        int two = 20;
        int three = 40;

        System.out.println("First number: " + one +
                ", Second number: " + two +
                ", Third number: " + three);

        int max = findMaxNumberFunction.action(one, two, three);
        System.out.println("Max number: " + max);

        int middle = averageFunction.action(one, two, three);
        System.out.println("Average: " + middle);

        int sum = sumFunction.action(one, two, three);
        System.out.println("Sum: " + sum);
    }
}

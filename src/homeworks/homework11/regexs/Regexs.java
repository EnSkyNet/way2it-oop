package homeworks.homework11.regexs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Regexs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        System.out.println("Enter text: (for end  - enter q)");
        ArrayList<String> text = new ArrayList<String>();
        String regexWord = "\\ba\\w*";
        while(true) {
            String word = scanner.nextLine();
            if (word.equals("q")) {
                break;
            }else if(word.matches(regexWord)) {
            text.add(word);
            }
        }
        System.out.print(text.toString() + "");
        System.out.println();
        //2
        System.out.println("Enter email address");
        String emailAddress = scanner.nextLine();
        String regexPattern = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        if ((emailAddress.matches(regexPattern))) {
            System.out.println("Email address: " + emailAddress);
        } else {
            System.out.println("It`s not a valid email address");
        }

        //3
        String str = "I love Java more than my friend. Java is so beautiful.";
        System.out.println(str.matches("(.*)Java(.*)"));
        System.out.println(str.replaceFirst("Java", "C#"));
        System.out.println(str.replaceAll("Java", "C#"));
    }
}

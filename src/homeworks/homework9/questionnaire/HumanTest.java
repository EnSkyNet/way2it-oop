package homeworks.homework9.questionnaire;

public class HumanTest {
    public static void main(String[] args) {
        Human human = null;
        try {
            human = new Human("Ivan", 10, "sss@10.com");
        } catch (UnderAgeException exp) {
            System.out.println(exp);
            System.out.println("Please try again");
            System.out.println();
        } catch (IncorrectEmailException exp) {
            System.out.println(exp);
            System.out.println("Please try again");
            System.out.println();
        }
        try {
            human = new Human("Stepan", 19, "cccA10.com");
        } catch (UnderAgeException exp) {
            System.out.println(exp);
            System.out.println("Please try again");
            System.out.println();
        } catch (IncorrectEmailException exp) {
            System.out.println(exp);
            System.out.println("Please try again");
            System.out.println();
        }
        try {
            human = new Human("Nazar", 19, "nazar@10.com");
        } catch (UnderAgeException exp) {
            System.out.println(exp);
            System.out.println("Please try again");
            System.out.println();
        } catch (IncorrectEmailException exp) {
            System.out.println(exp);
            System.out.println("Please try again");
            System.out.println();
        }
        System.out.println(human.toString());
    }
}

package homeworks.homework9.questionnaire;

public class Human {
    private String name;
    private int age;
    private String email;

    public Human(String name, int age, String email) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("The name should not be empty");
        } else {
            this.name = name;
        }
        if (age < 18 || age > 60) {
            throw new UnderAgeException("The age should be more than 18 year old.");
        } else {
            this.age = age;
        }
        if (email.contains("@")) {
            this.email = email;
        } else {
            throw new IncorrectEmailException("The email is uncorrected.");
        }
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Human: " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                " add.";
    }
}

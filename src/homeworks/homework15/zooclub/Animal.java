package homeworks.homework15.zooclub;

public class Animal {
    private String nickname;
    private String typeAnimal;

    public Animal(String nickname, String typeAnimal) {
        this.nickname = nickname;
        this.typeAnimal = typeAnimal;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public void setTypeAnimal(String typeAnimal) {
        this.typeAnimal = typeAnimal;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}

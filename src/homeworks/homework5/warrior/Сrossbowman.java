package homeworks.homework5.warrior;

public class Сrossbowman extends Warrior {
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        int chance = (int) (Math.random() * 101 + 900);
        this.health = health * chance;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        int chance = (int) (Math.random() * 6 + 15);
        this.damage = damage * chance;
    }

    @Override
    public void attack(int damage) {
        int chance = (int) (Math.random() * 11 + 10);
        this.health = (getHealth() - (chance * damage));
    }

    @Override
    public String status() {
        return "Crossbowman have health: " + this.health +
                " and damage: " + this.damage;
    }

    public Сrossbowman(int damage, int health) {
        setHealth(health);
        setDamage(damage);
    }
}

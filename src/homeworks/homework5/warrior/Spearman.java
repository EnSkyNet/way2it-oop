package homeworks.homework5.warrior;

public class Spearman extends Warrior {
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        int chance = (int) (Math.random() * 101 + 700);
        this.health = health * chance;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        int chance = (int) (Math.random() * 6 + 25);
        this.damage = damage * chance;
    }

    @Override
    public void attack(int damage) {
        int chance = (int) (Math.random() * 11 + 10);
        this.health = (getHealth() - (chance * damage));
    }

    @Override
    public String status() {
        return ("Spearman have health: " + getHealth() +
                " and damage: " + getDamage());
    }

    public Spearman(int damage, int health) {
        setHealth(health);
        setDamage(damage);
    }
}

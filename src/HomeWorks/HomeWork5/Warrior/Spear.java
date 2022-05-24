package HomeWorks.HomeWork5.Warrior;

public class Spear extends Warrior {
    private int health;
    private int damage;

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
        String s = ("Spear have health: " + getHealth() +
                " and damage: " + getDamage());
        return s;
    }

    public Spear(int damage, int health) {
        setHealth(health);
        setDamage(damage);
    }
}

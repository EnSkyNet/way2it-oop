package homeworks.homework5.warrior;

abstract class Warrior {
    protected int health;
    protected int damage;

    abstract int getHealth();

    abstract int getDamage();

    abstract void attack(int damage);

    abstract String status();
}

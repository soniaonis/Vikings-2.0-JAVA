package org.example.vikins;
import org.example.soldier.Soldier;

public class Vikings extends Soldier {
    public String name;

    public Vikings (String name, int health, int strength) {
        super(health, strength);
        this.name = name;
    }

    public String getMsg() {
        if (health <= 0) {
            return name + " has died in combat";
        } else {
            return name + " has received " + getDamage() + " points of damage";
        }
    }
    public int attack() {
        return getStrength();
    }

    public int attack(int damage) {
        return getStrength() - damage;
    }

    public void receiveDamage(int damage) {
        setHealth(getHealth() - damage);
    }

    public String battleCry() {
        return "Odin Owns You All!";
    }
}
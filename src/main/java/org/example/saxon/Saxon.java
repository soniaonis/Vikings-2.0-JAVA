package org.example.saxon;
import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    int health;
    int strength;
    public Saxon(int health, int strength) {

        super(health, strength);
    }

    public int attack() {

        return strength;
    }
    public void receiveDamage(int damage) {
        health -= damage;
    }

    public String getMsg() {
        if (health > 0) {
            return "A Saxon has received " + health + " points of damage";
        } else {
            return "A Saxon has died in combat";
        }
    }
}

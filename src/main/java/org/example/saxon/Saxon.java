package org.example.saxon;
import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public Saxon(int health, int strength) {
        super(health, strength);
    }

    public int attack() {
        return getStrength();
    }

    public int attack(int damage) {
        return getStrength();
    }

    public void receiveDamage(int damage) {
        int remainingHealth = getHealth() - damage;
        setHealth(remainingHealth);
    }

    public String getMsg() {
        if (getHealth() > 0) {
            return "A Saxon has received " + getHealth() + " points of damage";
        } else {
            return "A Saxon has died in combat";
        }
    }
}

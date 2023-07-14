package org.example.soldier;

public class Soldier {
    protected int health;
    int strength;
    public Soldier(int health, int strength){
        this.health = health;
        this.strength = strength;
    }
    public int attack() {
        return strength;
    }

    public void receiveDamage(int damage) {

        this.health -= damage;
    }
    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getDamage() {

        return health;
    }

    public void setHealth(int health) {

        this.health = health;
    }
}

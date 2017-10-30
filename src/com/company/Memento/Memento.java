package com.company.Memento;

public class Memento {
    private int health;
    private int level;

    public Memento(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

}

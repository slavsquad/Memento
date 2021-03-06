package com.company.Originator;

import com.company.Memento.Memento;

public class Player implements Originator {
    private int health;
    private int level;

    public Player() {
        this.health = 100;
        this.level = 1;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void hurt(int hurt){
        int hurtHealth = this.health - hurt;
        if (hurtHealth<0){
            this.health=0;
            System.out.println("Player is dead!!!");
        } else {
            this.health = hurtHealth;
            System.out.println("Player was hurting: "+ hurt);
        }
    }

    public void cure(int cure){
        int cureHealth = this.health + cure;
        if (cureHealth>100){
            this.health = 100;
            System.out.println("Player was completely health!!!");
        }else{
            this.health = cureHealth;
            System.out.println("Player was curing: "+ cure);
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
        System.out.println("Player jump to "+level+" level");
    }


    public void printState()
    {

        String pulse=null;
        if(this.health> 70)
            pulse = "green";

        if(this.health<= 70 && this.health> 40)
            pulse = "yellow";

        if (this.health <= 40)
            pulse = "red";

        System.out.println(String.format("State: Level[%d] Health[%d] Pulse[%s]",level,health,pulse));
    }

    @Override
    public Memento getMemento() {
        return new Memento(this.health,this.level);
    }

    @Override
    public void setMemento(Memento memento) {
        this.health = memento.getHealth();
        this.level = memento.getLevel();
    }
}

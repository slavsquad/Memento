package com.company.Caretaker;

import com.company.Memento.Memento;
import com.company.Originator.Originator;

public class GameTools {
    private Memento memento;

    public void save(Originator originator){
        if (originator==null ){
            throw new NullPointerException("Originator is null");
        }else{
            memento = originator.getMemento();
            System.out.println("Game was saving!");
        }
    }

    public void load(Originator originator){
        if (originator==null ){
            throw new NullPointerException("Originator is null");
        }else if(memento==null){
            throw new NullPointerException("Memento is null");
        }else{
            originator.setMemento(memento);
            System.out.println("Saving was loading!");
        }
    }
}

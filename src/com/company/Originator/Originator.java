package com.company.Originator;

import com.company.Memento.Memento;

public interface Originator {
    public Memento getMemento();
    public void setMemento(Memento memento);
}

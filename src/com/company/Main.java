package com.company;

import com.company.Caretaker.GameTools;
import com.company.Originator.Player;

public class Main {

    public static void main(String[] args) {
        GameTools gameTools= new GameTools();
        Player player = new Player();


        player.hurt(20); //нанесено урон 20
        player.hurt(30); //нанесено урон 30
        player.hurt(20); //нанесено урон 20
        player.printState();//печатаем пульс

        //сохраняем состояние
        gameTools.save(player);


        player.cure(30); //принимем лекарство
        player.setLevel(12);
        player.printState();//печатаем пульс

        //восстанавливаем состояние
        gameTools.load(player);

        player.printState(); //печатаем пульс
    }
}

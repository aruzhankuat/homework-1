package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {


    public abstract Character createCharacter(String name);

    public Character createAndShow(String name) {
        Character character = createCharacter(name);
        System.out.println("--------------------------------------------------");
        System.out.println("Factory created a new hero: " + character.getName());
        character.displayStats();
        return character;
    }
}
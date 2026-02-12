package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private int defense;
    private String name;

    public EnchantedRobes() {
        this.name = "Mystic Enchanted Robes";
        this.defense = 20;
    }

    @Override
    public void defend() {
        System.out.println(name + " creates a magical barrier blocking " + defense + " damage!");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDefense() {
        return defense;
    }
}
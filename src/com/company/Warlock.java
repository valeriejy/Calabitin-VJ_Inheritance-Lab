package com.company;

public class Warlock extends Character{
    Warlock(String name, int lvl, int hp, int mana){
        super(name, lvl,hp, mana);
    }

    //Skills Method
    public void fingerOfDeath(Character enemyCharacter){
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " Finger of Death (Damage - 30)");
        int damagePoints = 30;
        int manaCost = 10;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    };
    public void hex(Character enemyCharacter) {
        System.out.println(super.characterName + " attacks " + enemyCharacter.characterName + " with Hex (Damage - 50)");
        int damagePoints = 50;
        int manaCost = 20;
        damageTarget(enemyCharacter, damagePoints, manaCost);
    }
    public void healingLight(){
        super.healthPoints += 30;
        super.manaPoints += 30;
        System.out.println(super.characterName + " casted self heal (hp and mana restored by 30)" + "\n");
    }
}

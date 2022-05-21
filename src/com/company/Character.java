package com.company;

public class Character {
    public String characterName;
    public int level = 0;
    public int healthPoints = 100;
    public int manaPoints = 200;

    //two Constructors
    //non-parameterized Constructor
    Character() {
        System.out.println("null");
    }

    //Parameterized Constructor Initializing healthPoints, level, CharacterName and mana
    Character(String name, int lvl, int hp, int mana) {
        characterName = name;
        level = lvl;
        healthPoints = hp;
        manaPoints = mana;
    }

    /**
     * Create a Method that displays the Name of the Character
     * eg. "Character Initialized : Gandalf"
     */
    public void displayName() {
        System.out.println("Character Initialized : " + characterName);
    }

    public void damageTarget(Character enemyCharacter, int damagePoints, int manaCost) {
        /**
         * Deduct health points from enemy character
         */
        //  deduct character manaPoints
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println("Enemy character HP Left = " + enemyCharacter.healthPoints + "\n");
        manaPoints = manaPoints - manaCost;

        /**
         * Prompt Character is defeated if HP falls below 0
         */
        //  Level Up Character
        if (enemyCharacter.healthPoints <= 0) {
            System.out.println("Character " + enemyCharacter.characterName + " defeated.");
            level += 10;
            System.out.println(characterName + " Level up!!");
        }
    }
    public void addLevel(Character name){
        name.level += 10;
        System.out.println(name.characterName + " Level Up!");
    }
    //method on displaying current character details
    public void displayDetails(){
        System.out.println("Wizard : " + characterName);
        System.out.println("HealthPoints : " + healthPoints);
        System.out.println("Mana Points : " + manaPoints);
        System.out.println("Level : " + level);
        System.out.print("\n");
    }
}

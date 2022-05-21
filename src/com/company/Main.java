package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Wizards and Warlocks");

        Wizard Merlin = new Wizard("Merlin", 0, 100, 200);
        Warlock Saruman = new Warlock("Saruman", 0, 100, 200);

        //Battle Sequences
        Merlin.fireStorm(Saruman); // Saruman HP Deducted
        Saruman.fingerOfDeath(Merlin); //Merlin HP Deducted'
        Merlin.spellVamp();
        Saruman.hex(Merlin);
        Merlin.sunburst(Saruman);
        Saruman.hex(Merlin);


    }
    }


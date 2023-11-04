package org.example;

public class Troll extends Character {

    public Troll(){
        weapon = new AxeBehavior();
    }
    public void fight() {
        weapon.useWeapon();
    }
}

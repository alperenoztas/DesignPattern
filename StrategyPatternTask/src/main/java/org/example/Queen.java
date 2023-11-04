package org.example;

public class Queen extends Character{

    public Queen(){
        weapon = new BowAndArrowBehavior();
    }

    public void fight() {
        weapon.useWeapon();
    }
}

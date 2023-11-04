package org.example;

public class King extends Character{

    public King(){
        weapon = new KnifeBehavior();
    }

    public void fight() {
        weapon.useWeapon();
    }
}

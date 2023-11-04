package org.example;

public class Knight extends Character{

    public Knight(){
        weapon = new SwordBehavior();
    }

    public void fight() {
        weapon.useWeapon();
    }
}

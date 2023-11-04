package org.example;

public abstract class Character {
    WeaponBehavior weapon;
    public Character(){

    }

    public void fight(){
        System.out.println("I am null character I cant fight");
    }

    public void setWeapon(WeaponBehavior wb){
        this.weapon = wb;
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {


        Character quenn = new Queen();
        quenn.fight();
        quenn.setWeapon(new AxeBehavior());
        quenn.fight();

        Character troll = new Troll();
        troll.fight();
    }
}
package com.company;

import com.company.Boss.Boss;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.getDefense("Магическая защита");
        boss.getDamage(50);
        boss.getHealt(700);
        System.out.println("Атака Босса " + boss.getDamage(50)
                + ", " + "HP Босса " + boss.getHealt(700) + ", " + boss.getDefense("Магическая Защита."));
    }
}

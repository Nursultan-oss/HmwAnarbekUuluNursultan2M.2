package com.company;


public class Cat extends Animal {
    private String damage;

    public Cat(int age, String name, String damage) {
        super(age, name);
        this.damage = damage;
    }

    public String getDamage() {
        return damage;
    }

    @Override
    public void print() {
        System.out.println(getInfo()+ "\nDamage: " + damage);
    }
}
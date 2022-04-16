package com.company;

public class Main {

    public static void main(String[] args) {
        Printable print[] = {createObject("oneObject"), createObject("twoObject"), createObject("treeObject")};
        for (Printable printable: print){
            printable.print();
        }
    }

    public static Printable createObject(String className) {

        switch (className){
            case "oneObject":
                Dog dog= new Dog(12, "Sharik", "Кусать");

                return dog;

            case "twoObject":
                Cat cat = new Cat(6, "Barsik", "Царапать");
                return cat;

            case "treeObject":
                Donkey donkey = new Donkey(6, "Barsik", "Пинок ногой");
                return donkey;
        }
        return null;
    }
    }


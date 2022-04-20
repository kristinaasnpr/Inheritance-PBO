package com.tugasInheritance.pemrograman;

class Hero{
    String name;
    void display(){
        System.out.println("Name: " + this.name);
    }
}
class HeroStrenght extends Hero{
}
class HeroIntelligent extends Hero{
}
public class Inheritance {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Kristina";
        hero1.display();

        HeroStrenght hero2 = new HeroStrenght();
        hero2.name = "Yohani";
        hero2.display();

        HeroIntelligent hero3 = new HeroIntelligent();
        hero3.name = "Ivonnie";
        hero3.display();
    }
}
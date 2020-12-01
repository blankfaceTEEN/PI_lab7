package com.iskanderkhisamov;
/**
 * Класс человека со свойствами <b>name</b>, <b>age</b> и <b>alive</b>.
 * @author Искандер Хисамов
 * @version 0.1
 */
public class Human {
    /** Имя человека */
    String name = "Искандер";

    /** Возраст человека */
    int age = 20;

    /** Жив ли человек */
    boolean alive = true;

    /**
     * Процедура вывода имени человека и его псевдонима {@link Human#name}
     * @param pseudoname - псевдоним
     */
    public void printName(String pseudoname) {
        System.out.println("Имя: " + name);
        System.out.println("Псевдоним: " + pseudoname);
    }

    /**
     * Процедура вывода возраста человека {@link Human#age}
     */
    public void printAge() {
        System.out.println(age + " лет");
    }

    /**
     * Процедура вывода состояния человека {@link Human#alive}
     */
    public void printAlive() {
        if (alive)
            System.out.println("Живой");
        else
            System.out.println("Мертв");
    }
}

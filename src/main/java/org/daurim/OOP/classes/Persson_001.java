package org.daurim.OOP.classes;

// === Класс БЕЗ инкапсуляции
public class Persson_001 {

    // Поля не защищены модификатором private,
    // поэтому доступны напрямую откуда угодно
    // из пакета - это плохая практика
    String fullName;
    int age;

    public Persson_001(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Методы геттеры и сеттеры есть, но они не единственный способ доступа к полям,
    // поэтому инкапсуляция здесь не соблюдается
    public void getFullName() {
        System.out.println("User's full name is: " + fullName);
    }
    public void getAge() {
        System.out.println("User age: " + age);
    }

    public String setFullName(String fullName) {
        return this.fullName = fullName;
    }

    public int setAge (int age) {
        return this.age = age;
    }
}

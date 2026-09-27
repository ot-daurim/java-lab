package org.daurim.OOP.classes;


// === Класс С инкапсуляцией ===
public class Persson_002 {

    // Поля объявлены private - они скрыты от внешнего кода
    // и доступны только внутри данного класса
    private String fullName;
    private int age;


    // Единственный способ взаимодействия с полями из вне -
    // через публичные методы. Именно это и обеспечивает инкапсуляцию:
    // класс сам контролирует, как и в каком виде отдавать свое состояние
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

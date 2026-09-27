package org.daurim.OOP;


public class Main {
    public static void main(String[] args) {

        // === Класс БЕЗ инкапсуляции
        Person_001 user_001 = new Person_001("Arthur Morgan", 32);

        // Поля класса объявлены без модификатора private
        // к ним можно обратиться на прямую
        // это нарушает принцип инкапсуляции (сокрытие данных)

        System.out.println(user_001.fullName);

        // Доступ к состоянию объекта также возможен через методы,
        // но это не обязательно - прямой доступ никто не запрещает
        user_001.getFullName();
        user_001.getAge();

        // === Класс С инкапсуляцией ===
        Person_002 user_002 = new Person_002("Johnny Silverhand", 35);

        // Прямой доступ к полям запрещен компилятором,
        // так как они объявлены как private.
        // Если раскомментировать строку ниже -
        // будет ошибка компиляции: "'fullName' has private access i "Person_002'"
        // System.out.println(user_002.fullName);

        // Единственный способ получить данные - через публичные методы класса.
        // Это и есть суть инкапсуляции: состояние объекта скрыто,
        // а доступ к нему контролируется самим классом
        user_002.getFullName();
        user_002.getAge();

    }
}

// === Класс БЕЗ инкапсуляции
class Person_001 {

    // Поля не защищены модификатором private,
    // поэтому доступны напрямую откуда угодно
    // из пакета - это плохая практика
    String fullName;
    int age;

    public Person_001(String fullName, int age) {
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


// === Класс С инкапсуляцией ===
class Person_002 {

    // Поля объявлены private - они скрыты от внешнего кода
    // и доступны только внутри данного класса
    private String fullName;
    private int age;

    public Person_002(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

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

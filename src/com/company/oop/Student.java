package com.company.oop;

public class Student extends Person { // Наследуемся от класса Person
    // У класса Student есть доступ ко всем переменным с модификаторами public и protected
    public int corse;

    public Student(int hei, float wei, int cor) { // конструктор, который дополнительно вызывает конструктор родительского класса
        super(hei, wei); // Вызываем конструктор основного класса
        this.corse = cor;
    }
}

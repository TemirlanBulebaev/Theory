package com.company.oop;

public class Person { // на основе этого класса мы будем создавать объекты
     public int height;
     public float weight;

     public Person(int hei, float wei) { //Конструктор
          this.height = hei; // Говорим компилятору, что мы работает конкретно с переменной класса
          this.weight = wei;
     }

     public Person() { // Пустой конструктор
     }

     public void say(String str) {
          System.out.println(str);
     }

     public static int sum = 456;

     public static void write(String str){
          System.out.println(str);
     }
}


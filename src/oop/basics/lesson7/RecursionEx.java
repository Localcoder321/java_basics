package oop.basics.lesson7;

public class RecursionEx {
    static void main() {
        //Задача: посчитать сумму всех чисел от 1 до значения к
        int k = 10;
        Recursion recursion = new Recursion();
        int res = recursion.sum(k);
        System.out.println(res);
    }
}

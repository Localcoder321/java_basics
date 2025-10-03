package oop.enumeration;

import java.util.Arrays;

public class Runner {
    static void main() {
        //Задача:
        //Составить справочник стран, которым можно пользоваться
        //Япония: население 140млн, язык японский
        //Греция: население 10млн, язык греческий
        //Аргентина: население 47млн, язык испанский

        System.out.println(Arrays.toString(Country.values()));
        System.out.println(Country.valueOf("JAPAN").getPeopleCount());
    }
}

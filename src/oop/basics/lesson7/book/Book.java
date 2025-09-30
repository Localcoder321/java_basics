package oop.basics.lesson7.book;
//Создать класс книга с атрибутами: Имя книги, имя автора, количество страниц, документальный (да/нет)
//Методы класса книга:
//1. Вывод общего количества строк в книге - без аргументов:
//Результат: Выводит на экран количество страниц * 40
//2. Вывод общего количество строк в книге (количество строк в странице),
//Результат: Выводит на экран количество страниц * количество строк в странице
//3. Вывод информации о книге без аргументов
//Результат: [Имя книги] от [Имя автора] - [документельная/недокументальная] :
public class Book {
    String bookName;
    String authorName;
    int pages;
    boolean isDetective;

    public Book(String bookName, String authorName, int pages, boolean isDetective) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.pages = pages;
        this.isDetective = isDetective;
    }

    public void countRowsOnPage() {
        System.out.println("This book's text count on page: " + this.pages*40);
    }

    public void countRowsOnPage(int countRows) {
        System.out.println("This book's text count on page: " + this.pages*countRows);
    }

    public void aboutTheBook() {
        System.out.printf("%s от %s - %s", this.bookName, this.authorName, this.isDetective?"документельная":"недокументальная");
    }
}

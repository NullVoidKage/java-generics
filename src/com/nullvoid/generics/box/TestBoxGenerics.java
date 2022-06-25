package com.nullvoid.generics.box;

public class TestBoxGenerics {
    public static void main(String[] args) {
        Box<Book> bookBox = new Box<>();
        //Invoked box generic type
        // Replace T parameter in Box class
        bookBox.addItem(new Book("Harry Potter", "JK Rowling", 3.2));
        bookBox.addItem(new Book("Ratbu", "JK Rat", 21.2)); //
        System.out.println(bookBox.getLatestItem());
        System.out.println("Book Count " + BoxUtils.getCountOfItems(bookBox));
        System.out.println("Total Box Weight: " + bookBox.getTotalWeight());

        Box<Fruit> fruitBox = new Box<>();
        fruitBox.addItem(new Fruit("Mango", "China", "red", 1.2));
        fruitBox.addItem(new Fruit("Orange", "Kayatan", "black", 6.9));
        System.out.println(fruitBox.getLatestItem());
        System.out.println("Fruit Count " + BoxUtils.getCountOfItems(fruitBox));
        System.out.println("Total Fruit Weight: " + fruitBox.getTotalWeight());

    }
}

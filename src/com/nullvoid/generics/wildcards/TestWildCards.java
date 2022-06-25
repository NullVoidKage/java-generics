package com.nullvoid.generics.wildcards;

import com.nullvoid.generics.apple.Apple;
import com.nullvoid.generics.box.*;

//public class TestWildCards extends Box<?> { Error: Super types
public class TestWildCards{
    public static void main(String[] args) {
        //new Box<?>(); Error: Generic type instantiation
        //var box=BoxUtils.<?>emptyBox(); Error: Generic method invocation

        //Unbounded WC
        Box<Book> bookBox = new Box<>();
        //Invoked box generic type
        // Replace T parameter in Box class
        bookBox.addItem(new Book("Harry Potter", "JK Rowling", 3.2));
        bookBox.addItem(new Book("Ratbu", "JK Rat", 21.2));
        System.out.println("Count of books" + BoxUtils.getCountOfItems(bookBox)); //Unbounded by class

        //Upper Bounded WC
        Box<Fruit> fruitBox = new Box<>(); // Box<Apple> appleBox = new Box<>(); Also work
        fruitBox.addItem(new Apple("Mango", "China", "red", 1.2));
        fruitBox.addItem(new Apple("Orange", "Kayatan", "black", 6.9));
        System.out.println("Average of Weight of Fruit" + Box.getAverageWeightOfFruit(fruitBox));

        //Lower Bounded WC
        Box<Apple> appleBox = new Box<>();
        Box<Boxable> boxableBox = new Box<>();
        Box.addAppleToBox(appleBox);
        Box.addAppleToBox(fruitBox);
        Box.addAppleToBox(boxableBox);
//      Box.addAppleToBox(bookBox); Error Cannot invoke

    }
}

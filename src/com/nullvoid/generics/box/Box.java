package com.nullvoid.generics.box;

import com.nullvoid.generics.apple.Apple;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Boxable>{ //Extends Boxable Interface
    private List<T> items;//always private instance var

    public Box(){
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public T getLatestItem(){
        return this.items.get(items.size() - 1);
    }

    public List<T> getItems() {
        return items;
    }

    public Double getTotalWeight() {
        double totalWeight = 0.0;
//        for (T item : this.items) {
//            return totalWeight += item.getWeight(); //Get the item from getWeight method in Boxable
//
//        }
        return this.items.stream().mapToDouble(Boxable::getWeight).sum();
        // Every item in stream map it to double, Provide the func from Boxable class (method references ::)
    }

    public static <T extends Boxable> Box<T> of(T t){ //Return box of T parameter of Type t
        Box<T> box = new Box<>(); // Instance of the box
        box.addItem(t); //Invoke addItem method and pass incoming arg t
        return box;  //Return box
        //Only instance method automatically generate
    }

    public static Double getAverageWeightOfFruit(Box<? extends Fruit> box){ //The param is using upper bounded WC, this method get average weight of Fruit going to accept any argument that is a fruit or subclass of a fruit
        return box.getItems().stream().mapToDouble(Boxable::getWeight).sum()/box.getItems().size();
    }

    public static void addAppleToBox(Box<? super Apple> box){ //Lowe bounded WC
        box.addItem(new Apple("Royal Gala", "Sweden", "green", 12.3));
    }
    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}

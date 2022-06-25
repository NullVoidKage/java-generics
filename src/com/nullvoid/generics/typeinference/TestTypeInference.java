package com.nullvoid.generics.typeinference;

import com.nullvoid.generics.apple.Apple;
import com.nullvoid.generics.box.Box;
import com.nullvoid.generics.box.BoxUtils;
import com.nullvoid.generics.box.Fruit;

public class TestTypeInference {
    public static void main(String[] args) {
        // Type Witness Demo
//        var list:List<String> = Collection.<String>emptyList();
        //Type Inference Demo
        Number number = pickOne(12, 2.3); //Integer cannot CAST
        System.out.println(number);

        Fruit fruit = new Fruit("Mango", "India", "red", 12.3);
        Apple apple = new Apple("Royal Gala", "Sweder",
                "Green", 2.3);

        Fruit pickedFruit = pickOne(fruit, apple); //Boxable also
        //It can cast Apple to Fruit not Fruit to Apple

        //1. Type inference w/ instantiation
        Box<Fruit> fruitBox = new Box<>();

        //2. Type inference w/ method arguments
        var box= Box.of(fruit);
        var anotherBox = Box.of(apple);

        //3. Type inference w/ target types
        var emptyBox = BoxUtils.emptyBox();
        Box<Fruit> fruitBox1 = BoxUtils.emptyBox(); //Target type was box of fruit
        Box<Apple> appleBox = BoxUtils.emptyBox(); //Target type was box of apple


    }
    public static <T> T pickOne(T t1, T t2){
        if(Math.random()>0.5){
            return t1;
        } else {
            return t2;
        }
    }

}

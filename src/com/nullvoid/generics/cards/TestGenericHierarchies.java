package com.nullvoid.generics.cards;

import com.nullvoid.generics.apple.Apple;
import com.nullvoid.generics.box.Fruit;
import com.nullvoid.generics.box.Box;
public class TestGenericHierarchies {
    public static void main(String[] args) {
        CardBoardBox<Fruit> cardBoardBox = new CardBoardBox<>();

        Box<Fruit> fruitBox = new Box<>();

        fruitBox = cardBoardBox;

        //Type argument Hierarchies
        Box<Apple> appleBox = new Box<>();
//        fruitBox = appleBox;

    }
}

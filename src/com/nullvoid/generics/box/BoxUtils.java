package com.nullvoid.generics.box;

public class BoxUtils {
//    public static <T extends Boxable> int getCountOfItems(Box<T> box){ //Mention parameter <T> define explicit
//        return box.getItems().size(); // Get generic methods outside class
//    }

    public static int getCountOfItems(Box<?> box){ //It will bound any kind of types
        return box.getItems().size(); // Get generic methods outside class
    }

    public static<T extends Boxable> Box<T> emptyBox(){
        return new Box<>();
    }
}

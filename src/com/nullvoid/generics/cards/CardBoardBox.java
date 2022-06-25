package com.nullvoid.generics.cards;

import com.nullvoid.generics.box.Box;
import com.nullvoid.generics.box.Boxable;

//public class CardBoardBox extends Box { // Raw Types dont Use
//
//}
public class CardBoardBox<T extends Boxable> extends Box<T> {
    /*Generic Subclass , always need subclass
    to pass the parameter that already define in super class*/

    @Override
    public Double getTotalWeight(){ // Override the getTotalWeight in Box Class
        return super.getTotalWeight()+0.1; // Super Override func gtw in Box class
    }

}

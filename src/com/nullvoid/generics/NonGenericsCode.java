package com.nullvoid.generics;

import java.util.ArrayList;
import java.util.List;

public class NonGenericsCode {
    public static void main(String[] args){
        List languages = new ArrayList(); // New Array list
        languages.add("Ratbu"); // Add new String Value
        Object value = new String("Swedish"); //New Object Value String "Swedish"
        languages.add(value); // Add new Object Value
        proccessLanguage(languages); // PL method pass languages argument
    } 

    /*
    * Problems without Generics
    * - Needs explicit casting
    * - Lacks type safety
    * */

    private static void proccessLanguage(List data) { // private PL list of paramete
        String language = (String)data.get(0); // when pass integer it will return error
        System.out.println(language);
    }
}

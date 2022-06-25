package com.nullvoid.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsCode {
    private static List<String> languages;

    public static void main(String[] args){
        List<String> languages = new ArrayList<String>();
        languages.add("Englissh");
        languages.add("Swedish");
        processLanguage(languages);



    }
    private static void processLanguage(List<String> languages){
        String language = languages.get(0);
        System.out.println(language);
    }
}

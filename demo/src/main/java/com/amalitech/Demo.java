package com.amalitech;

import org.jetbrains.annotations.NotNull;

public class Demo
{
    public static void main( String[] args )
    {
        DictionaryService dictionary = DictionaryService.getInstance();
        System.out.println(lookup(dictionary, "book"));
        System.out.println(lookup(dictionary, "editor"));
        System.out.println(lookup(dictionary, "xml"));
        System.out.println(lookup(dictionary, "REST"));
    }

    public static String lookup(@NotNull DictionaryService dictionary, String word) {
        String outputString = word + ": ";
        String definition = dictionary.getDefinition(word);
        if (definition == null) {
            return outputString + "Cannot find definition for this word";
        }else{
            return outputString + definition;
        }
    }
}

package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // English to Spanish Dictionary
        Map<String,String> englSpanDictionary = new HashMap<>();
        englSpanDictionary.put("Monday","Lunes");
        englSpanDictionary.put("Tuesday","Martes");
        englSpanDictionary.put("Wednesday","Miercolese");
        englSpanDictionary.put("Thursday","Jueves");
        englSpanDictionary.put("Friday","Viernes");
        englSpanDictionary.put("Saturday","Sabado");
        englSpanDictionary.put("Sunday","Domingo");

        // Retrieve things from our dictionary
        System.out.println(englSpanDictionary.get("Monday"));
        System.out.println(englSpanDictionary.get("Tuesday"));
        System.out.println(englSpanDictionary.get("Wednesday"));
        System.out.println(englSpanDictionary.get("Thursday"));
        System.out.println(englSpanDictionary.get("Friday"));

        // Print out all keys
        System.out.println(englSpanDictionary.keySet());

        // Print out all keys
        System.out.println(englSpanDictionary.values());

        // Print out size
        System.out.println("The size of our dictionary is " + englSpanDictionary.size());

        System.out.println();
        System.out.println();

        // Shopping list
        Map<String,Boolean> shoppingList = new HashMap<>();

        // Put some stuff in dictionary
        shoppingList.put("Ham", true);
        shoppingList.put("Bread", Boolean.TRUE);
        shoppingList.put("Oreos", Boolean.TRUE);
        shoppingList.put("Eggs", Boolean.FALSE);
        shoppingList.put("Sugar", false);

        // Retrieve items
        System.out.println(shoppingList.get("Ham"));
        System.out.println(shoppingList.get("Sugar"));

        // Key-Value pairs print out
        System.out.println(shoppingList.toString());

        // Is empty?
        System.out.println(shoppingList.isEmpty());

        // Remove items
        shoppingList.remove("Eggs");

        // Replace values for a certain key
        shoppingList.replace("Bread", Boolean.FALSE);

        // Key-Value pairs print out
        System.out.println(shoppingList.toString());


        // Clear our dictionary
        shoppingList.clear();
        System.out.println(shoppingList.toString());

        // Is empty?
        System.out.println(shoppingList.isEmpty());
    }
}

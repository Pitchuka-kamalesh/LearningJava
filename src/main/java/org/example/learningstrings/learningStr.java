package org.example.learningstrings;

public class learningStr {
    String greeting = "Hello World";

//    System.out.println("Before substring: "+ greeting);
    // Here we use two Substring methods one method we have given two variables first one is staring index and second one is ending index

    String s = greeting.substring(0, 3);

    // Here we are given only one index it's staring index only.
    String s1 = greeting.substring(2);

//        System.out.println(s);
//        System.out.println(s1);


    // Here we use concatenation of the two strings using the "+" symbol.
    String expletive = "Expletive";
    String PG13 = "deleted";
    String message = expletive + PG13;

//    System.out.println(message);
//    greeting = greeting.substring(0,3)+ "pl";
//    System.out.println(greeting);

    public static void main(String[] args) {


        //note:  In this we are using the quality of the string using two string methods and == symbol.

        String greeting = "Hello World";

        if ("Hello World".equals(greeting)) {
            System.out.println(greeting == "Hello World");
        }
        // Problem that any string operations done to the string we can't use  "==" operator intested us are using the equals operator.
        if (greeting.substring(0, 3) == "Hel") {
            System.out.println(greeting.substring(0, 3) == "Hel");
        } else {
            System.out.println("Hel".equals(greeting.substring(0, 3)));

        }
        // We are using the equals operator
        if ("hel".equalsIgnoreCase(greeting.substring(0, 3))) {
            System.out.println("True it's working");
        }


    }


}


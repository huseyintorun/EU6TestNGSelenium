package com.cybertek.JAVA.Replit_ArrayList;

import java.util.ArrayList;

public class ArrayList002 {

    public static void main(String[] args) {

       /* We will be manipulating elements of an ArrayList by using List methods.

        The first List method we will learn is .add()

        The following code will take an ArrayList of Strings called strs and add "Hello" to it.

        strs.add("Hello");
        strs.add("Hello");
        The syntax is:

        arraylistvariable.add(data_to_add);
        arraylistvariable.add(data_to_add);
        Add three names (any names) to the ArrayList called names.*/

        ArrayList<String> names = new ArrayList<String>();
        names.add("Ali");
        names.add("Vali");
        names.add("Kali");



        System.out.println(names.size());
    }


}
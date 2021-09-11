package com.cybertek.JAVA.Replit_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Set {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        list.remove(0);
        list.remove(0);








        System.out.println(list);



    }
}

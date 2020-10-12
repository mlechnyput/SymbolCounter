package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    static Vector<String> v = new Vector<String>();
    static Object[] arr;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter arbitrary string: ");
        arr=methCount(scan.nextLine().toLowerCase()).toArray();
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }

    public static Vector methCount(String str) {
        String strNew = "";
        int counter = 0;
        char first = ' ';
        for (int i = 0; i < str.length(); i++) {
            first = str.charAt(0);
            if (str.charAt(i) == first) {
                counter++;
            } else strNew += str.charAt(i);
        }
        v.add(first + "-->" + counter + " times  ");

        if (strNew == "") return v;
        methCount(strNew);
        return v;
    }
}

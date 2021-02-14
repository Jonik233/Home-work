package com.company.feature;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words = input.nextLine();
        int counter = 0;
        int length = words.length();
        char ch;
        for (int i = 0; i < length; i++) {
            ch = words.charAt(i);
            if (words.indexOf(ch) < i)
                continue;
            for (int j = 0; j < length; j++) {
                if (words.charAt(j) == ch)
                    counter++;
             }
            System.out.println(ch + ": " + counter);
            counter = 0;
            }

        }
    }




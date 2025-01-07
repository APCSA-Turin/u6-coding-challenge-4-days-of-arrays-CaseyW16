package com.example.project;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        int nice = 0;
        int naughty = 0;
        String[][] result = {new String[names.length], new String[names.length]};
        for (int i = 0; i < names.length; i++) {
            if (Math.random() < 0.5) {
                result[0][nice] = names[i];
                nice++;
                continue;
            } 
            result[1][naughty] = names[i];
            naughty++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
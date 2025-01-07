package com.example.project;
public class Day1 {
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name.isEmpty()) throw new IllegalArgumentException("Name cannot be null or empty");
        String firstName = elf_names[(int)(Math.random() * 5)];
        return firstName + name;  
    }
}
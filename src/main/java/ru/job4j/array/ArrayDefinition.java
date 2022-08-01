package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prices = new float[40];
        System.out.println(prices.length);
        String[] names = new String[4];
        names[0] = "Dmitriy Khodyrev";
        names[1] = "Andrey Petrov";
        names[2] = "Vadim Antonov";
        names[3] = "Alex Ivanov";
        for (String name : names) {
            System.out.println(name);
        }
    }
}

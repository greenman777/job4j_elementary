package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(first, second) + division(first, second);
    }

    public static double sumAndMultiplyAndMinusAndDivision(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(first, second) + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 равен: " + minusAndDivision(10, 20));
        System.out.println("Результат расчета 3 равен: " + sumAndMultiplyAndMinusAndDivision(10, 20));
    }
}
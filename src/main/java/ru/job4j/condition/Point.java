package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2)  {
        double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return  d;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result);
        double result1 = Point.distance(5, 2, 6, 8);
        System.out.println("result (5, 2) to (6, 8) = " + result1);
        double result2 = Point.distance(9, 6, 8, 4);
        System.out.println("result (9, 6) to (8, 4) = " + result2);

    }
}

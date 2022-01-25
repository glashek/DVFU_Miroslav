package ru.dvfu.mrcpk.java01.example07.types;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class StaticImport2 {

    public static void main(String[] args) {
        calculate(20, 40);
    }

    private static void calculate(int i, int j) {
        double x, y;
        x = pow(i, 2);
        y = sqrt(j) / 2;
        System.out.println("x=" + x + " y=" + y);
        return;
    }
}

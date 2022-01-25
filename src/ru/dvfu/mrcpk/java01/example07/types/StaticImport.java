package ru.dvfu.mrcpk.java01.example07.types;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
public class StaticImport {
    private int i = 20;
    private int j = 40;

    public void staticImport() {
        double x, y;
        x = pow(i, 2);
        y = sqrt(j) / 2;
        System.out.println("x=" + x + " y=" + y);
    }

    public static void main(String[] args) {
        StaticImport obj = new StaticImport();
        obj.staticImport();
    }
}


package ru.dvfu.mrcpk.java01.tasks.i01.t05;

import java.util.Scanner;
public class Main {public static void main(String[] args) {
    System.out.println("Уравнение ax+b=0");
    Scanner scan = new Scanner(System.in);
    System.out.print("Введите значение a = ?");
    double a = scan.nextDouble();
    System.out.print("Введите значение b = ?");
    double b = scan.nextDouble();
    scan.close();

    System.out.println(a + "x + (" + b + ") = 0");
    if (a == 0) {
        System.out.println("Ошибка: a = 0");
    } else {
        double x=-b/a;
        System.out.println("x = " + x);
    }

}
}

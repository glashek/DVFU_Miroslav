package ru.dvfu.mrcpk.java01.tasks.i01.t02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значение в консоль:");
        int x = new Scanner(System.in).nextInt();
        int y = (x-x%10)/10;
             System.out.println(
                "Количество десятков в числе  "
                        + x
                        + " равно "
                        + y
        );
    }
}

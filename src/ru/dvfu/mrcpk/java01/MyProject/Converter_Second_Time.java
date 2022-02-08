package ru.dvfu.mrcpk.java01.MyProject;

import java.time.LocalTime;
import java.util.Scanner;

public class Converter_Second_Time {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите в консоль значение секунд:");
        long Sec = scan.nextInt();
        scan.close();
        LocalTime.ofSecondOfDay(Sec);
        System.out.println(LocalTime.ofSecondOfDay(Sec));
    }
}

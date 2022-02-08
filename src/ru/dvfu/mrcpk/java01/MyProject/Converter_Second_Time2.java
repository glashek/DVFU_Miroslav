package ru.dvfu.mrcpk.java01.MyProject;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Converter_Second_Time2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите в консоль значение секунд:");
        long Sec = scan.nextInt();
        scan.close();
        int days = (int) TimeUnit.SECONDS.toDays(Sec);
        long hours = TimeUnit.SECONDS.toHours(Sec) - TimeUnit.DAYS.toHours(days);
        long minutes = TimeUnit.SECONDS.toMinutes(Sec) - TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours(Sec));
        long seconds = TimeUnit.SECONDS.toSeconds(Sec) - TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes(Sec));
        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(days+" Дней "+hours+" Часов "+minutes+" Минут "+seconds+" Секунд");
    }
}
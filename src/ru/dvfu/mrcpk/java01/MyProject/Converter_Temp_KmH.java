package ru.dvfu.mrcpk.java01.MyProject;
import java.util.Scanner;
public class Converter_Temp_KmH {
    public static void main(String[] args) {
        System.out.println("Перевод Темпа в км/ч");
        System.out.println("Введите в консоль значение минут:");
        Scanner scan = new Scanner(System.in);
        int Min = scan.nextInt();
        System.out.println("Введите в консоль значение секунд:");
        int Sec = scan.nextInt();
        scan.close();
        float Secun = Min*60+Sec;
        float KmH = 3600/Secun;
        System.out.println(KmH);
        String Result = String.format("%.1f",KmH);
        System.out.println("Скорость: "+Result+" км/ч");
}
}

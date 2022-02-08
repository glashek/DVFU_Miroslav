package ru.dvfu.mrcpk.java01.MyProject;
import java.util.Scanner;
public class Converter_KmH_Temp {
    public static void main(String[] args) {
        System.out.println("Перевод км/ч в Темп");
        System.out.println("Введите в консоль скорость в км/ч:");
        Scanner scan = new Scanner(System.in);
        float KmH = scan.nextFloat();
        scan.close();
        float Temp = 60/KmH;
        System.out.println("Темп бега "+Temp+" минут на километр");
        float Secun = Temp*60;
        int Sec = Math.round(Secun);
        System.out.println("Ваш темп бега "+"<"+((Sec/60)%60)+":"+Sec%60+">");
        System.out.println(((Sec/60)%60)+" минут "+Sec%60+" секунд");
    }
}

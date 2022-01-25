package ru.dvfu.mrcpk.java01.tasks.i01.t03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Число = ?");
        int a = scan.nextInt();
        System.out.println(a - a%2 + 2);
    }
}

package ru.dvfu.mrcpk.java01.tasks.i01.t03;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Число = ?");
        int n = scan.nextInt();
        System.out.println(n - n%2 + 2);
    }
}

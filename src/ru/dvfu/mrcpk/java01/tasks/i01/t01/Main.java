package ru.dvfu.mrcpk.java01.tasks.i01.t01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = x % 10;
        System.out.println("Младший разряд: " + y);
            }
}

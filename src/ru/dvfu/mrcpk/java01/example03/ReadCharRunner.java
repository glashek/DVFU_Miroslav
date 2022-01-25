package ru.dvfu.mrcpk.java01.example03;

import java.io.InputStreamReader;

public class ReadCharRunner {
    public static void main(String[] args) {
        int x;
        System.out.println("Введите символ в коммандную строку и нажмите <Enter>:");
        try {
            x = System.in.read();
            //комментарий
            char c = (char)x;
            /*
            первая строка комментария
            вторая строка комментария
             */
            System.out.println("Код символа: "+c+" = "+x) ;
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

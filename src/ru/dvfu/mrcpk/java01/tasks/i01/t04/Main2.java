package ru.dvfu.mrcpk.java01.tasks.i01.t04;

public class Main2 {
    public static void main (String args [ ]) {
        int[] numbers = {10, 22, 38, 56};
        float resultat = 0;
        for (int i=0; i<numbers.length; i++)
            resultat = resultat + numbers[i];
        System.out.println("Среднее значение = " + resultat / numbers.length);
    }
}

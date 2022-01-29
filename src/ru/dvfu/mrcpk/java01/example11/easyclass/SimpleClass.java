package ru.dvfu.mrcpk.java01.example11.easyclass;
import java.util.Date;
public class SimpleClass {
    private Date today;
    public Date getToday() {
        return today;
    }
    public static final int PROGRAM_SIZE = 560;
    public static void main(String[] args) {
        SimpleClass object = new SimpleClass();
        System.out.println(object.getToday());
        System.out.println(object.PROGRAM_SIZE);
    }
}

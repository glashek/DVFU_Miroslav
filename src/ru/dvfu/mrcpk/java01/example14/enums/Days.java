package ru.dvfu.mrcpk.java01.example14.enums;

public enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY("Суббота");

    String value;

    Days(){}
    Days(String s){this.value = s;}

    public boolean isWeekend() {
        switch(this) {
            case SUNDAY:
            case SATURDAY:
                return true;
            default:
                return false;
        }

    }
}

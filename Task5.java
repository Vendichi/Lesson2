package Lesson2;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(checkLeapYear(2019));
    }
    private static boolean checkLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}

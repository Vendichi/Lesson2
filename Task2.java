package Lesson2;

public class Task2 {
    public static void main(String[] args) {
        positivOrnegativ(-5);
    }

    public static void positivOrnegativ(int a){
        if (a >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
}

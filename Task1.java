package Lesson2;

public class Task1 {
    public static void main(String[] args){
        System.out.println( AandB(14,2) );
    }

    static boolean AandB(int a, int b){
        int c = a + b;
        return c >= 10 && c <= 20;
    }
}

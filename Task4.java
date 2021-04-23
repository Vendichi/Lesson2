package Lesson2;

public class Task4 {
    public static void main(String[] args) {
        printText("print", 3);
    }

    public static void printText(String word, int times) {
        int i;
        for (i = 0; i < times; i++) {
            System.out.println(word);
        }
    }
}

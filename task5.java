package TaskTwo;

public class task5 {

    public static void main(String[] args) {
        float a = 2020.0f;
        if (a % 4 == .0f && a % 100 == 0){
            System.out.println(a + "- Високосный год");
        } else {
            System.out.print(a + " - Невисокосный год");
        }
    }
}

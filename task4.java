public class task4 {

    public static void main(String[] args) {
        print("print", 3);
    }

    public static void print(String word, int times) {
        int i;
        for (i = 1; i <= times; i++) {
            System.out.println(word);
        }
    }
}
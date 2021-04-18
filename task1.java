public class task1 {

    public static void main(String[] args){
        System.out.println( AandB(7,2) );
    }

    static boolean AandB(int a, int b){
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }
}

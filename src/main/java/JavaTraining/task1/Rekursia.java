package JavaTraining.task1;

public class Rekursia {
    public static void main(String[] args) {
        counter(3);
    }

    public static void counter(int n) {
        if (n == 0) return;
        System.out.println(n);

        counter(n - 1);
    }
}

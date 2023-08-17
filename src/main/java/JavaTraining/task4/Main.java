package JavaTraining.task4;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(progression(5));
    }

    public static int progression(int n) throws Exception {
        if (n <= 0) throw new Exception("the number should be positive");
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;

        }
        return sum;
    }

}

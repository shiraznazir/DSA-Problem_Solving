import java.util.ArrayList;

public class index {
    static ArrayList<Integer> checkPrime(int N) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 10;
        ArrayList<Integer> result = checkPrime(N);
        System.out.println(result);
    }
}

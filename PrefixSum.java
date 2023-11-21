import java.util.Scanner;

/**
 * PrefixSum
 */

public class PrefixSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        int p[] = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        p[0] = a[0];

        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + a[i];
        }
        System.out.println("Enter the num of queries : ");
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            int sum = 0;
            System.out.println("Enter the left index : ");
            int l = sc.nextInt();
            System.out.println("Enter the right index : ");
            int r = sc.nextInt();
            sum = p[r];
            if (l > 0) {
                sum -= p[l - 1];
            }
            System.out.println("result " + sum);
        }

        sc.close();
    }
}

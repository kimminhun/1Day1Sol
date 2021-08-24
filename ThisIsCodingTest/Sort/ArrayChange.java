package ThisIsCodingTest.Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        Integer[] B = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        for (int i = 0; i < K; i++) {
            if (A[i] < B[i]) {
                // 두 원소를 교체
                int temp = A[i];
                A[i] = B[i];
                B[i] = temp;
            }
           break;
        }
        int sum=0;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        System.out.println(sum);
    }
}

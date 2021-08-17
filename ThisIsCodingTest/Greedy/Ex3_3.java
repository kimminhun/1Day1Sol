package ThisIsCodingTest.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex3_3 {
    public static int min(int[] ar){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <ar.length; i++) {
            if(min>ar[i]) min = ar[i];
        }
        return min;
    }
    public static int max(int[][] ar){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if(max<ar[i][0]) max = ar[i][0];
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] ar = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j <M ; j++) {
                ar[i][j] = Integer.parseInt(st.nextToken());
            }
            ar[i][0] = min(ar[i]);
        }

        System.out.println(max(ar));
    }
}

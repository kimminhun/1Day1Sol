package Practice.August_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_12738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] ar = new int[N];
        int[] LIS = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        LIS[0] = ar[0];
        int idx=1;
        for (int i = 1; i < N; i++) {
            if (LIS[idx-1]<ar[i]) LIS[idx++] = ar[i];
            else if(LIS[0]>ar[i]) LIS[0] = ar[i];
            else{
                int tmp = Arrays.binarySearch(LIS, 0, idx, ar[i]);
                if(tmp<0) tmp = -(tmp + 1);
                else tmp=tmp;
                LIS[tmp] = ar[i];
            }
        }
        System.out.println(idx);


    }
}

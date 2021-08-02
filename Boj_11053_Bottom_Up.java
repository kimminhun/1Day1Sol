package Practice.August_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11053_Bottom_Up {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] ar = new int[N];
        int[] dp = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            dp[i]=1;

            for (int j = 0; j < i; j++) {
                if(ar[j]<ar[i]&&dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int max=-1;
        for (int i = 0; i < N; i++) {
            max=Math.max(dp[i],max);
        }
        System.out.println(max);
    }
}

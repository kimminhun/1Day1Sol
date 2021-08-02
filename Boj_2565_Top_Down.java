package Practice.August_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Boj_2565_Top_Down {
    static int[][] ar;
    static  int[] dp;

    static int recur(int N){
        if(dp[N]==0){
            dp[N]=1;
            for (int i = N+1; i <dp.length ; i++) {
                if(ar[N][1]<ar[i][1]){
                    dp[N] = Math.max(dp[N], recur(i) + 1);
                }
            }
        }
        return dp[N];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ar = new int[N][2];
        dp = new int[N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            ar[i][0] = Integer.parseInt(st.nextToken());
            ar[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(ar, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });


        int max=0;
        for (int i = 0; i < N; i++) {
            max = Math.max(recur(i),max);
        }
        max = N - max;
        System.out.println(max);

    }
}

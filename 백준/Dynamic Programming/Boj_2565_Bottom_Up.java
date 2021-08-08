package Practice.August_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Boj_2565_Bottom_Up {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] ar = new int[N][2];
        int[] dp = new int[N];
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

        for (int i= 0; i <N ; i++) {
           dp[i]=1;
            for (int j = 0; j < i; j++) {
                if(ar[i][1]>ar[j][1]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int max=0;
        for (int i = 0; i < N; i++) {
            max = Math.max(max, dp[i]);
        }
        max = N - max;
        System.out.println(max);

    }
}

package Practice.July_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1912_Bottom_Up {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] ar=new int[N];
        int[] dp=new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = ar[0];
        int max=ar[0];

        for (int i = 1; i < N; i++) {
            dp[i]=Math.max(dp[i-1]+ar[i],ar[i]);
            max=Math.max(max,dp[i]);
        }

        System.out.println(max);

    }
}

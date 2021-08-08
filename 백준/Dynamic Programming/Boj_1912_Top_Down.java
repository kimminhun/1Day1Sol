package Practice.July_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1912_Top_Down {
    static int max;
    static Integer[] dp;
    static int[] ar;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        ar=new int[N];
        dp=new Integer[N];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = ar[0];
        max=ar[0];


        recur(N-1);
        System.out.println(max);
    }

    static int recur(int N){
        if(dp[N]==null){
            dp[N]=Math.max(recur(N-1)+ar[N],ar[N]);
            max=Math.max(dp[N],max);
        }
        return dp[N];
    }
}

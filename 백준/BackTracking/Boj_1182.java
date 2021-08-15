package Practice.August_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1182 {
    static int N,S;
    static int[] ar;
    static int cnt;

    public static void dfs(int dpt, int sum) {
        if (dpt == N) {
            if(sum==S){
                cnt++;
            }
            return;
        }
        dfs(dpt + 1, sum + ar[dpt]);
        dfs(dpt + 1, sum);

    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        ar = new int[N];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0, 0);
        if(S==0) System.out.println(cnt - 1);
        else System.out.println(cnt);


    }

}

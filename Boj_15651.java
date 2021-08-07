package Practice.August_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15651 {
    static int[] ar;
    static boolean[] visit;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void dfs( int a) {
        if (a == M) {
            for (int i = 0; i < M; i++) {
                sb.append(ar[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 1; i <=N ; i++) {
            ar[a] = i;
            dfs(a + 1);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ar = new int[M];

        dfs(0);
        System.out.println(sb);
    }
}

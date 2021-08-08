package Practice.August_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15650 {
    static int[] ar;
    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int cri, int a) {
        if (a == M) {
            for (int v : ar) {
                sb.append(v).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = cri; i <=N ; i++) {
            ar[a] = i;
            dfs(i + 1, a + 1);
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ar = new int[M];

        dfs(1,0);
        System.out.println(sb);
    }
}

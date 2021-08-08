package Practice.August_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15649 {
    static int[] ar;
    static boolean[] visit;
    static int N,M;
    static StringBuilder sb = new StringBuilder();

    public static void dfs(int a) {
        if(M==a){
            for(int b:ar){
                sb.append(b).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visit[i]){
                visit[i] = true;
                ar[a] = i + 1;
                dfs(a + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        ar = new int[M];
        visit = new boolean[N];

        dfs(0);
        System.out.println(sb);
    }
}

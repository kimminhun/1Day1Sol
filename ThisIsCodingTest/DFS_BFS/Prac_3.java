package ThisIsCodingTest.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Prac_3 {
    static int N,M;
    static int[][] ar;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static int dfs(int x, int y){
        visited[x][y]=true;
        for (int i = 0; i < 4; i++) {
            int cx = x + dx[i];
            int cy = y + dy[i];
            if(cx>=0&&cy>=0&&cx<N&&cy<M){
                if(ar[cx][cy]==0&&!visited[cx][cy]){
                    dfs(cx, cy);
                }
            }
        }
        return 1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ar = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                ar[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        int cnt=0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(ar[i][j]==0&&!visited[i][j])
                cnt += dfs(i, j);
            }
        }
        System.out.println(cnt);
    }
}

package ThisIsCodingTest.DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Prac_4 {
    static int N,M;
    static int[][] ar;
    static boolean[][] visited;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};

    static class XY{
        int x;
        int y;
         XY(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void bfs(int x,int y){
        Queue<XY> que = new LinkedList<>();
        que.add(new XY(x, y));
        while (!que.isEmpty()){
            XY xy = que.poll();
            for (int i = 0; i < 4; i++) {
                int cx = xy.x + dx[i];
                int cy = xy.y + dy[i];
                if(cx>=0&&cy>=0&&cx<N&&cy<M){
                    if(!visited[cx][cy]&&ar[cx][cy]==1){
                        que.add(new XY(cx, cy));
                        ar[cx][cy] = ar[xy.x][xy.y] + 1;
                        visited[cx][cy] = true;
                    }
                }
            }
        }

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
        visited[0][0]=true;
        bfs(0, 0);
        System.out.println(ar[N-1][M-1]);

    }
}

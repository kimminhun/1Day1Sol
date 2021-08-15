package Practice.August_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2206 {
    static int[][] ar;
    static int[][] visit;
    static int N, M;
    private static int[] dx = {0, 0, -1, 1};
    private static int[] dy = {-1, 1, 0, 0};

    static class Point{
        int x,y;
        int dist,drill;

        public Point(int x, int y, int dist, int drill) {
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.drill = drill;
        }
    }


    public static int bfs(int x, int y){
        Queue<Point> que = new LinkedList<>();
        que.add(new Point(x,y,1, 0));
        visit[y][x]=0;
        while(!que.isEmpty()){
            Point p = que.poll();
            if(p.x==M-1&&p.y == N - 1){
              return p.dist;
            }

            for (int i = 0; i < 4; i++) {
                int cx = p.x + dx[i];
                int cy = p.y + dy[i];
                if(cx>=0&&cy>=0&&cx<M&&cy<N){
                    if(visit[cy][cx]>p.drill){
                        if(ar[cy][cx]==0){
                            que.add(new Point(cx, cy, p.dist + 1, p.drill));
                        }else {
                            if(p.drill==0){
                                que.add(new Point(cx, cy, p.dist + 1, p.drill + 1));
                                visit[cy][cx] = p.drill + 1;
                            }
                        }
                    }
                }
            }
        }
        return -1;


    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ar = new int[N][M];
        visit = new int[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                ar[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
                visit[i][j] = Integer.MAX_VALUE;
            }
        }


        System.out.println(bfs(0,0));


    }
}

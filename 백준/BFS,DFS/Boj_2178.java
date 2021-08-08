package Practice.July_25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2178 {
    static int N,M;
    static int[][] visit;
    static boolean[][] visited;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};

    static class xy{
        int x;
        int y;

        xy(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void bfs(int x, int y){
        Queue<xy> que=new LinkedList<>();
        que.add(new xy(x,y));
        while (!que.isEmpty()){
            xy xy=que.poll();
            for (int i = 0; i < 4; i++) {
                int cx = xy.x + dx[i];
                int cy = xy.y + dy[i];

                if(cx>=0&&cy>=0&&cx<N&&cy<M){
                    if(visit[cx][cy]!=0&&!visited[cx][cy]){
                        que.add(new xy(cx,cy));
                        visit[cx][cy]=visit[xy.x][xy.y]+1;
                        visited[cx][cy]=true;
                    }
                }
            }
        }


    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        visit=new int[N][M];
        visited=new boolean[N][M];
        for (int i = 0; i < N; i++) {
            st=new StringTokenizer(br.readLine());
            String str=st.nextToken();
            for (int j = 0; j < M; j++) {
                visit[i][j]=str.charAt(j)-'0';
                visited[i][j]=false;
            }
        }
        visited[0][0]=true;
        bfs(0,0);
        System.out.println(visit[N-1][M-1]);


    }
}

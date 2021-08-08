package Practice.July_25;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_7576 {

    static int N;
    static int M;
    static int[][] farm;
    static int[] dx={-1,0,1,0};
    static int[] dy={0,1,0,-1};


    static class xy{
        int x;
        int y;
        int day;

        public xy(int x,int y,int day){
            this.x=x;
            this.y=y;
            this.day=day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());

        farm=new int[M][N];

        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0; j<N; j++) {
                farm[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs();

    }

    static void bfs(){
        Queue<xy> que=new LinkedList<xy>();
        int day=0;

        for (int i = 0; i < M; i++) {
            for (int j = 0; j <N ; j++) {
                if(farm[i][j]==1){
                    que.add(new xy(i,j,0));
                }
            }
        }

        while (!que.isEmpty()){
            xy xy=que.poll();
            day=xy.day;

            for (int i = 0; i < 4; i++) {
                int cx=xy.x+dx[i];
                int cy=xy.y+dy[i];

                if(0<=cx&&0<=cy&&cx<M&&cy<N){
                    if(farm[cx][cy]==0){
                        farm[cx][cy]=1;
                        que.add(new xy(cx,cy,day+1));
                    }
                }

            }
        }
        if(checking()) System.out.println(day);
        else System.out.println(-1);

    }
    static boolean checking(){
        for (int i = 0; i <M ; i++) {
            for (int j = 0; j < N; j++) {
                if(farm[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }




}

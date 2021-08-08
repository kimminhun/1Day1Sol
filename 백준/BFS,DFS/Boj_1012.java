package Practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_1012 {
    static int N,M,K;
    static int[][] check;
    static boolean[][] checked;
    static int[] dx= {0,-1,0,1};
    static int[] dy= {1,0,-1,0};

    public static int dfs(int x,int y) {
        checked[x][y]=true;
        for (int i = 0; i < 4; i++) {
            int cx=x+dx[i];
            int cy=y+dy[i];
            if (cx>=0&&cy>=0&&cx<M&&cy<N) {
                if(check[cx][cy]==1&&!checked[cx][cy]) {

                    dfs(cx,cy);
                }
            }
        }
    return 1;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        ArrayList<Integer> ar=new ArrayList<>();
        int t=Integer.parseInt(st.nextToken());
        for (int i=0;i<t;i++){
            int cnt=0;
            st=new StringTokenizer(br.readLine()," ");
            M=Integer.parseInt(st.nextToken());
            N=Integer.parseInt(st.nextToken());
            K=Integer.parseInt(st.nextToken());
            check=new int[M][N];
            checked=new boolean[M][N];
            for (int j = 0; j < K; j++) {
                st=new StringTokenizer(br.readLine()," ");
                int a=Integer.parseInt(st.nextToken());
                int b=Integer.parseInt(st.nextToken());
                check[a][b]=1;
            }
            for (int j = 0; j <M; j++) {
                for (int j2 = 0; j2 <N ; j2++) {
                    if(check[j][j2]==1&&!checked[j][j2]) {
                        checked[j][j2]=true;
                       dfs(j,j2);
                       cnt++;
                    }
                }
            }
           ar.add(cnt);


        }
        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
    }
}
